package com.example.feignclient.configuration;

import com.example.feignclient.rule.MyRandomRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new MyRandomRule();
//        return new RandomRule();
    }
}
