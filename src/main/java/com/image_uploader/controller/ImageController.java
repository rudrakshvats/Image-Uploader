package com.image_uploader.controller;

import com.image_uploader.exception.BadRequestException;
import com.image_uploader.service.ImageService;
import org.bytedeco.javacv.FrameGrabber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;

@Controller
@RequestMapping("/image")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @PostMapping("/uploadImageViaWebcam")
    public String uploadImageViaWebcam(@RequestParam MultipartFile file) throws InterruptedException, IOException, BadRequestException, NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException {
        return imageService.uploadImageViaWebcam(file);
    }
}
