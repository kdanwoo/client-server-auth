package com.example.clientserverauth.config;
// import 생략

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private static final long MAX_AGE_SECONDS = 3600;


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}