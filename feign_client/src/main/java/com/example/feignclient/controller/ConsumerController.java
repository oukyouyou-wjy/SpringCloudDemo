package com.example.feignclient.controller;

import com.example.feignclient.cache.RequestHolder;
import com.example.feignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private FeignService feignService;

    @GetMapping("/Consumer/hi")
    public String sayHi(){
        return feignService.sayHi();
    }

    @GetMapping("/Consumer/{port}")
    public String sayHiByPort(@PathVariable int port){
        System.out.println("sayHiByPort port: " + port);
        RequestHolder.setContext(port);
        System.out.println("RequestHolder port: " + RequestHolder.getContext());
        return feignService.sayHi();
    }
}
