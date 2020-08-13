package com.example.feignclient.service;

import com.example.feignclient.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "PROVIDER-DEMO", fallback = FeignServiceImpl.class)
public interface FeignService {
    @GetMapping("/Provider/hi")
    String sayHi();
}
