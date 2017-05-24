package com.example.caching.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = { "com.example.caching" })
public class SampleCrudExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleCrudExampleApplication.class, args);
    }
}
