package com.wangzefeng.lovers.java.service;

import com.wangzefeng.lovers.java.domain.SysUser;

import java.util.List;

public interface LoginService {


    int addOne(SysUser sysUser);

    int addList(List<SysUser> sysUsers);

    int deleteById(Integer userId);

    int updateOne(SysUser sysUser);

    SysUser findById(Integer userId);

    SysUser findByAccount(String userAccount);

    List<SysUser> findByName(String userName);


}
