package com.ichromanrd.app.foodapp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
public class SecretKeyConfig {

    @Value("secret-key")
    private String secretKey;

}
