package com.wangzefeng.sso.controller;

import com.wangzefeng.sso.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("/index")
    public String index(){
        redisUtil.set("name","王大大");
        return "设置成功";
    }
    @RequestMapping("/index2")
    public String index2(){
        Object name = redisUtil.get("name");
        return name.toString();
    }

}
