package com.invoax.partfinder.picklistservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PicklistServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PicklistServiceApplication.class, args);
    }
}
