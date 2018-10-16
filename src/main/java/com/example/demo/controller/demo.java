package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class demo {
    @RequestMapping("login")
    public String hi(){
        //测试一下
        return  "哈哈";
    }
}
