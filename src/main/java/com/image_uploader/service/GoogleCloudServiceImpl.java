/**
 * SATIN CREDITCARE NETWORK LIMITED CONFIDENTIAL
 * __________________
 * <p>
 * [2018] SATIN CREDITCARE NETWORK LIMITED
 * All Rights Reserved.
 * <p>
 * NOTICE:  All information contained herein is, and remains the property of SATIN CREDITCARE NETWORK LIMITED, and
 * The intellectual and technical concepts contained herein are proprietary to SATIN CREDITCARE NETWORK LIMITED
 * and may be covered by India and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission
 * is obtained from SATIN CREDITCARE NETWORK LIMITED.
 */
package com.image_uploader.service;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.Storage;
import com.image_uploader.config.GoogleStorageConfig;
import com.image_uploader.exception.BadRequestException;
import com.image_uploader.utils.MyProperties;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Base64;
import java.util.Objects;

@Service
class GoogleCloudServiceImpl implements GoogleCloudService {

    @Autowired
    private GoogleStorageConfig config;

    @Autowired
    private MyProperties properties;

    private static final String BASE_GCS_URL = "https://storage.googleapis.com";

    @Transactional(rollbackOn = Exception.class)
    @Override
    public Blob uploadExpenseDocument(String GCP_FileName, String documentId, MultipartFile file)
            throws IOException, ObjectNotFoundException, BadRequestException {
        String bucketName = properties.getExpenseBucketName();
        // extract file data/meta
        String fileName = Objects.requireNonNull(file.getOriginalFilename()).replaceAll(" ", "");
        InputStream inputStream = file.getInputStream();
        String contentType = file.getContentType();
        Bucket bucket = getBucket(bucketName);
        String bucketObjectPath = GCP_FileName + "/" + documentId+"_"+fileName;
        return bucket.create(bucketObjectPath, inputStream, contentType);
    }

    //@Override
    public Bucket getBucket(String bucketName) throws ObjectNotFoundException, IOException, BadRequestException {
        Storage storage = config.initializeClient();
        Bucket bucket = storage.get(bucketName);
        if (bucket == null)
            throw new BadRequestException("Bucket doesn't exist:", HttpStatus.OK);
        return bucket;
    }

    @Override
    public String generateSignedFileUrl(String objectPath, int urlValidityTimeInSeconds)
            throws NoSuchAlgorithmException, InvalidKeySpecException,
            IOException, InvalidKeyException, SignatureException {

        long now = System.currentTimeMillis();

        long expiredTimeInSeconds = (now + urlValidityTimeInSeconds * 1000L) / 1000;
        String expiryTime = expiredTimeInSeconds + "";

        String stringToSign = getSignInput(objectPath, expiryTime);
        PrivateKey pk;

        pk = getPrivateKey();
        String signedString = getSignedString(stringToSign, pk);
        // URL encode the signed string so that we can add this URL
        signedString = URLEncoder.encode(signedString, "UTF-8");

        return getSignedUrl(objectPath, signedString, expiryTime);

    }

    // Use SHA256withRSA to sign the request
    private static String getSignedString(String input, PrivateKey pk)
            throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(pk);
        privateSignature.update(input.getBytes(StandardCharsets.UTF_8));
        byte[] s = privateSignature.sign();
        return Base64.getEncoder().encodeToString(s);

    }

    private static String getSignInput(String objectPath, String expiryTime) {
        return "GET" + "\n" + "" + "\n" + "" + "\n" + expiryTime + "\n" + objectPath;
    }

    private PrivateKey getPrivateKey() throws IOException,
            NoSuchAlgorithmException, InvalidKeySpecException {
        // Remove extra characters in private key.
        String privateKey = config.getPrivateKey();
        String realPK = privateKey.replaceAll("-----END PRIVATE KEY-----", "")
                .replaceAll("-----BEGIN PRIVATE KEY-----", "").replaceAll("\n", "");
        byte[] b1 = Base64.getDecoder().decode(realPK);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(b1);
        KeyFactory kf = KeyFactory.getInstance("RSA");
        return kf.generatePrivate(spec);
    }

    // The signed URL format as required by Google.
    private String getSignedUrl(String objectPath, String signedString, String expiryTime)
            throws IOException {

        String objectUrl = BASE_GCS_URL + objectPath;

        return objectUrl + "?GoogleAccessId=" + config.getClientEmail() + "&Expires=" + expiryTime
                + "&Signature=" + signedString;
    }
}
