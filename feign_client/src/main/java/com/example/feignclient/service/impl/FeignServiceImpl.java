package com.example.feignclient.service.impl;

import com.example.feignclient.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String sayHi() {
        return "Something wrong hanppend. Please email the manager.";
    }
}
