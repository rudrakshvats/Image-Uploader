package com.image_uploader.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.image_uploader.constant.Constant;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GoogleCloudProperties {

    @JsonProperty(Constant.PRIVATE_KEY)
    public String privateKey;

    @JsonProperty(Constant.CLIENT_EMAIL)
    public String clientEmail;

    GoogleStorageConfig config;

}
