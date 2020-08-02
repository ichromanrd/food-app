package com.ichromanrd.app.foodapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "my-config")
public class MyConfig {
    private String config1;
    private String config2;
}
