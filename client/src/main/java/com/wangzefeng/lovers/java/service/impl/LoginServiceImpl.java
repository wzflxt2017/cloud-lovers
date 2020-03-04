package com.wangzefeng.lovers.java.service.impl;

import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.domain.SysUserExample;
import com.wangzefeng.lovers.java.mapper.SysUserMapper;
import com.wangzefeng.lovers.java.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int addOne(SysUser sysUser) {

        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int addList(List<SysUser> sysUsers) {
        return 0;
    }

    @Override
    public int deleteById(Integer userId) {
        return sysUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public int updateOne(SysUser sysUser) {
        return sysUserMapper.updateByPrimaryKey(sysUser);
    }

    @Override
    public SysUser findById(Integer userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public SysUser findByAccount(String userAccount) {
        return sysUserMapper.selectByAccount(userAccount);
    }

    @Override
    public List<SysUser> findByName(String userName) {
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        return sysUserMapper.selectByExample(userExample);
    }
}
