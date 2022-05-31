package me.tsinyong.commonprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CommonProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonProviderApplication.class, args);
    }
}