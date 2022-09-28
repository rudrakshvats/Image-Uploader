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
/**
 *
 */
package com.image_uploader.service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.cloud.storage.Blob;
import com.image_uploader.exception.BadRequestException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

/**
 * @author shahzad.hussain
 *
 */
public interface GoogleCloudService {

    Blob uploadExpenseDocument(String GCP_FileName, String documentId, MultipartFile file)
            throws IOException, ObjectNotFoundException, NumberFormatException, BadRequestException;

    String generateSignedFileUrl(String objectPath, int urlValidityTimeInSeconds) throws JsonParseException, JsonMappingException, NoSuchAlgorithmException, InvalidKeySpecException, IOException, InvalidKeyException, SignatureException;
}
