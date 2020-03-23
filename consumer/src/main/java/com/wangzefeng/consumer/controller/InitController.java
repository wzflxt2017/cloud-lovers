package com.wangzefeng.consumer.controller;

import com.wangzefeng.consumer.feignClient.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangzefeng on 2020/3/23 0023.
 */
@RestController
@RequestMapping("/")
public class InitController {
    @Autowired
    private FeignClientUtil feignClientUtil;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public String getUserName() {
        return feignClientUtil.getUserName();
    }
}
