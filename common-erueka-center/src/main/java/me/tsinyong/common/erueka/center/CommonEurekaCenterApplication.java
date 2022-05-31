package me.tsinyong.common.erueka.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CommonEurekaCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonEurekaCenterApplication.class, args);
    }

}
