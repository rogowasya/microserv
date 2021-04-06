package ru.iteco.ou.edukids.microfrontendapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OuFrontendAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OuFrontendAppApplication.class, args);
    }

}
