package com.example.commonconsumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @GetMapping("/aa")
    public String aa() {
        return "" + System.currentTimeMillis();
    }

}
