package com.ding.springbootwiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//通常返回字符串
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
