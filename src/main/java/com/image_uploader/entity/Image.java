package com.image_uploader.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "IMAGES")
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IMAGE_ID")
    private Integer imageId;
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Column(name = "IMAGE_PATH")
    private String imagePath;
    @Column(name = "CREATED_ON")
    private Date createdOn;
}
