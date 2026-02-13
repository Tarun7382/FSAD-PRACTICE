package com.klu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.klu")
public class SpringBootDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAppApplication.class, args);
    }
}9/