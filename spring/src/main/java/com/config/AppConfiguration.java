package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.service.Language;
import com.service.impl.Vietnamese;
@Configuration
@ComponentScan({"com.*"})

public class AppConfiguration {

    @Bean(name ="language") 
    public Language getLanguage() {

        return new Vietnamese();
    }
     
}