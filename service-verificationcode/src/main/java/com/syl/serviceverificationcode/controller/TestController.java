package com.syl.serviceverificationcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/getVerifyCode")
    public String getTest(){
        return "service-verificationCode";
    }
}
