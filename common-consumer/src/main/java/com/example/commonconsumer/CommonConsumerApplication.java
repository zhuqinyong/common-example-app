package com.example.commonconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CommonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommonConsumerApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate rest(){
        return new RestTemplate();
    }
}