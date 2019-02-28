package com.example.config.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @NacosValue(value = "${myname}",autoRefreshed = true)
    private String myname;

    @NacosValue(value = "${age}",autoRefreshed = true)
    private String age;

    @GetMapping("confT")
    public String test(){
        return myname+"-------"+age;
    }
}

