package com.example.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("hello")
    public void say(String s){
        System.out.println("嘤嘤嘤"+s);
    }
}
