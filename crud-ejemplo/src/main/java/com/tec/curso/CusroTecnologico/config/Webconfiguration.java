package com.tec.curso.CusroTecnologico.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//CORS
@Configuration
@EnableWebMvc
public class Webconfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**").allowedOrigins("*")
                .allowedMethods("GET","HEAD","POST","DELETE","OPTIONS","PATCH");
        WebMvcConfigurer.super.addCorsMappings(registry);
    }

}
