package com.wangzefeng.lovers.controller;


import com.wangzefeng.lovers.base.CommonController;
import com.wangzefeng.lovers.domain.entity.SysUser;
import com.wangzefeng.lovers.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@RestController
@RequestMapping("/sys-user")
public class SysUserController extends CommonController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/index")
    public String index(){
        SysUser sysUser = sysUserService.getById(1);
        return ""+sysUser.getFullName();
    }

}
