package com.entelgy.excercise.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ConfigApp {
    @Value("${character.baseurl}")
    private String Baseurl;


    @Bean
    public WebClient webConfig(){
        return WebClient.builder().baseUrl(Baseurl).build();
    }
}
