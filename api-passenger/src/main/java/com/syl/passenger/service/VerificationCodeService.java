package com.syl.passenger.service;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class VerificationCodeService {

    public String generatorCode(String passengerPhone){
        //调用验证码服务, 获取验证码
        System.out.println("============");

        String code = "1111";
        //存入redis
        System.out.println("存入redis");

        JSONObject result = new JSONObject();
        result.put("code","1");
        result.put("message","success");
        return result.toString();
    }
}
