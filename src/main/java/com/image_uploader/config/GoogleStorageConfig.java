package com.image_uploader.config;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Configuration
@Component
public class GoogleStorageConfig {

    @Value("${cloud.serviceAccountFileLocation}")
    private String serviceAccountFileLocation;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Bean
    public Storage initializeClient() throws IOException {
        ClassPathResource resource = new ClassPathResource(serviceAccountFileLocation);
        GoogleCredentials credentials = GoogleCredentials.fromStream(resource.getInputStream())
                .createScoped(Lists.newArrayList("https://www.googleapis.com/auth/cloud-platform"));
        return StorageOptions.newBuilder().setCredentials(credentials).build().getService();
    }

    @Bean
    public String getPrivateKey() throws IOException {

        GoogleCloudProperties properties = objectMapper.readValue(
                new ClassPathResource(serviceAccountFileLocation).getInputStream(), GoogleCloudProperties.class);
        return properties.privateKey;

    }

    @Bean
    public String getClientEmail() throws JsonParseException, JsonMappingException, IOException {

        GoogleCloudProperties properties = objectMapper.readValue(
                new ClassPathResource(serviceAccountFileLocation).getInputStream(), GoogleCloudProperties.class);
        return properties.clientEmail;

    }
}
