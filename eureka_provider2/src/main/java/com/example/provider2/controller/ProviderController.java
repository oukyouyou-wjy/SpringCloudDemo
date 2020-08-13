package com.example.provider2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/Provider/hi")
    public String sayHi(){
        return "provider2 hello world!";
    }
}
