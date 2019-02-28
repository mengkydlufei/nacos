package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("consumer")
    public void say(String s){
        restTemplate.getForObject("http://nacos-provider/hello?s="+s,String.class);
    }
}
