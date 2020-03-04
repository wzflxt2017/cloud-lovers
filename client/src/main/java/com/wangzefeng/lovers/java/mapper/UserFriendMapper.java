package com.wangzefeng.lovers.java.mapper;

import com.wangzefeng.lovers.java.domain.UserFriend;
import com.wangzefeng.lovers.java.domain.UserFriendExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserFriendMapper{

    long countByExample(UserFriendExample example);

    int deleteByExample(UserFriendExample example);

    int deleteByPrimaryKey(Integer userFriendId);

    int insert(UserFriend record);

    int insertSelective(UserFriend record);

    List<UserFriend> selectByExample(UserFriendExample example);

    UserFriend selectByPrimaryKey(Integer userFriendId);

    int updateByExampleSelective(@Param("record") UserFriend record, @Param("example") UserFriendExample example);


    int updateByExample(@Param("record") UserFriend record, @Param("example") UserFriendExample example);


    int updateByPrimaryKeySelective(UserFriend record);

    int updateByPrimaryKey(UserFriend record);


}