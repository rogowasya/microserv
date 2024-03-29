package ru.iteco.micro.app.prototyp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroPrototypAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroPrototypAppApplication.class, args);
    }

}
