package com.example.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class MyController {
    @Value("${foo}")
    String foo;

    @RequestMapping("/foo")
    public String hi(){
        return foo;
    }
}
