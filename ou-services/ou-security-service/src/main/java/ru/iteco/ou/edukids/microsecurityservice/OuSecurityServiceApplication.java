package ru.iteco.ou.edukids.microsecurityservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@EnableAuthorizationServer
@SpringBootApplication
public class OuSecurityServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OuSecurityServiceApplication.class, args);
    }

}
