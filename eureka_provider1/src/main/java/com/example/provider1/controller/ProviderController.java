package com.example.provider1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/Provider/hi")
    public String sayHi(){
        return "provider1 hello world!";
    }
}
