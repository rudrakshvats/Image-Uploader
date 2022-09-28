/**
 *
 */
package com.image_uploader.utils;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author shahzad.hussain
 *
 */
@Service
@ConfigurationProperties("cloud")
public class MyProperties {

    private String expenseBucketName;


    public String getExpenseBucketName() {
        return expenseBucketName;
    }

    public void setExpenseBucketName(String bucketName) {
        this.expenseBucketName = bucketName;
    }

}
