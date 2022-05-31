package com.example.commonconsumer;

import com.example.commonconsumer.test.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
    @Autowired
    private Service service;

    @GetMapping("/do/it")
    public String doInvoke() {
        return service.hi();
    }
}
