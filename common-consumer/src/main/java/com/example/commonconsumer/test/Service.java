package com.example.commonconsumer.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider", fallback =FallBack.class)
public interface Service {
    @GetMapping("/hi")
    String hi();
}
