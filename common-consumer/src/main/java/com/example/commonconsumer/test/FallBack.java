package com.example.commonconsumer.test;

import org.springframework.stereotype.Component;

@Component
public class FallBack implements Service {

    @Override
    public String hi() {
        return "调用失败";
    }
}
