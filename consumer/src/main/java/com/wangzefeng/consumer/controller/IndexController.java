package com.wangzefeng.consumer.controller;

import com.wangzefeng.consumer.feignClient.FeignClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private FeignClientUtil feignClientUtil;

    @RequestMapping(value = "/get-username", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
    public String postPerson(Integer id) {
        return feignClientUtil.getUserName(id);
    }

}
