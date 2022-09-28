package com.image_uploader.service;

import com.google.cloud.storage.Blob;
import com.image_uploader.entity.Image;
import com.image_uploader.exception.BadRequestException;
import com.image_uploader.repository.ImageRepository;
import com.image_uploader.utils.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;

import static com.image_uploader.constant.Constant.SEPARATOR;

@Service
public class ImageServiceImpl implements ImageService{

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private GoogleCloudService googleCloudService;

    @Autowired
    private MyProperties properties;
    @Override
    public String uploadImageViaWebcam(MultipartFile file) throws BadRequestException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException {
        Blob blob = googleCloudService.uploadExpenseDocument("images", new Date().toString(), file);
        saveDocumentEntry(file, getSignedURL(blob.getName()));
        return "Image Uploaded Successfully!";
    }

    private void saveDocumentEntry(MultipartFile file, String signedURL) {
        Image image = new Image();
        image.setImageName(file.getOriginalFilename());
        image.setCreatedOn(new Date());
        image.setImagePath(signedURL);
        imageRepository.save(image);
    }

    public String getSignedURL(String name) throws NoSuchAlgorithmException, InvalidKeySpecException, IOException, SignatureException, InvalidKeyException {
        String bucketName = properties.getExpenseBucketName();
        String bucketObjectPath = SEPARATOR + bucketName + SEPARATOR + name;
        int urlValidityInSeconds = 60 * 60 * 24 * 365 * 10;
        return googleCloudService.generateSignedFileUrl(bucketObjectPath, urlValidityInSeconds);
    }
}
