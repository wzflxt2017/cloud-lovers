package com.wangzefeng.consumer.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="eureka-client")
public interface FeignClientUtil {
    @RequestMapping(value = "/sys-user/index", method = RequestMethod.GET)
    String getUserName();

    @RequestMapping(value = "/sys-user/list", method = RequestMethod.GET)
    String userList();

    @RequestMapping(value = "/sys-user/getUserById", method = RequestMethod.GET)
    String getUserById(Integer id);
}
