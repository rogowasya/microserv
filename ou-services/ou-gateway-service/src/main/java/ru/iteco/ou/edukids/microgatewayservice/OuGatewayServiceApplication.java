package ru.iteco.ou.edukids.microgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class OuGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OuGatewayServiceApplication.class, args);
    }

}
