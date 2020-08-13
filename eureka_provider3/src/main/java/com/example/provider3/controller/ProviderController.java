package com.example.provider3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
    @Value("${name}")
    private String name;

    @GetMapping("/Provider/hi")
    public String sayHi(){
        return "config-single-demo name:" + name;
    }
}
