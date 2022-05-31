package me.tsinyong.commonprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/hi")
    public String hi() {
        return "" + System.currentTimeMillis();
    }
}
