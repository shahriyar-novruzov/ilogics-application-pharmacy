package com.ilogics.application.pharmacy.config.jwt;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {

    private String secretKey = "secretsecretsecretsecretsecretsecret";

    //validity in milliseconds
    private long validityInMs = 20000; // 1h
}
