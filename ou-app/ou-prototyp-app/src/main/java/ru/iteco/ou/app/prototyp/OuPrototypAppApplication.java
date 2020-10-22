package ru.iteco.ou.app.prototyp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OuPrototypAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(OuPrototypAppApplication.class, args);
    }

}
