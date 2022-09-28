package com.image_uploader.service;

import com.image_uploader.exception.BadRequestException;
import org.bytedeco.javacv.FrameGrabber;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

public interface ImageService {
    String uploadImageViaWebcam(MultipartFile file) throws IOException, InterruptedException, BadRequestException, NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException;
}
