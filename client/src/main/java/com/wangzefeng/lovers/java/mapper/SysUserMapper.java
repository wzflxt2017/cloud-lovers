package com.wangzefeng.lovers.java.mapper;

import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.domain.SysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper{




    SysUser selectByAccount(String userAccount);


    long countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer userId);


    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    List<SysUser> selectFriendByUserId(Integer userId);
    List<SysUser> selectFriendByMessage(Integer userId);
    List<SysUser> findAllMessageUsersByUserId(@Param("userId") Integer userId);


    SysUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);


    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);


    int updateByPrimaryKey(SysUser record);
}