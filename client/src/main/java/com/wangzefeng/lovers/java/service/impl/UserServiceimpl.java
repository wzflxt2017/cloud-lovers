package com.wangzefeng.lovers.java.service.impl;

import com.wangzefeng.lovers.java.domain.*;
import com.wangzefeng.lovers.java.mapper.SysUserMapper;
import com.wangzefeng.lovers.java.mapper.UserFriendMapper;
import com.wangzefeng.lovers.java.mapper.UserMessageMapper;
import com.wangzefeng.lovers.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-26 09:16
 * @Description:
 */
@Service
public class UserServiceimpl implements UserService {


    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private UserFriendMapper userFriendMapper;

    @Autowired
    private UserMessageMapper userMessageMapper;

    @Override
    public List<SysUser> findByName(String userName) {
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        return sysUserMapper.selectByExample(userExample);
    }

    @Override
    public List<SysUser> selectFriendById(Integer userId) {
        List<SysUser> sysUsers = sysUserMapper.selectFriendByUserId(userId);
        return sysUsers;
    }

    @Override
    public void updateUser(SysUser sysUser) {
        sysUser.setModifiedTime(Calendar.getInstance().getTime());
        sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }

    @Override
    public SysUser findById(Integer userId) {
        return sysUserMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<SysUser> searchUsersByNameOrAccount(String userName) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        sysUserExample.or().andUserAccountEqualTo(userName);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        return sysUsers;
    }

    @Override
    public void addFriends(SysUser self, List<Integer> friendIds) {
        for(Integer i=0;i<friendIds.size();i++){
            UserFriendExample userFriendExample = new UserFriendExample();
            UserFriendExample.Criteria criteria = userFriendExample.createCriteria();
            criteria.andUserIdEqualTo(self.getUserId());
            criteria.andFriendIdEqualTo(friendIds.get(i));
            List<UserFriend> userFriends = userFriendMapper.selectByExample(userFriendExample);
            if(userFriends==null||userFriends.size()==0){
                UserFriend userFriend = new UserFriend();
                userFriend.setUserId(self.getUserId());
                userFriend.setFriendId(friendIds.get(i));
                userFriend.setFriendName(findById(friendIds.get(i)).getUserName());
                userFriendMapper.insert(userFriend);
            }
        }
    }

    @Override
    public List<SysUser> findAll(Integer userId) {
        return sysUserMapper.selectFriendByUserId(userId);
    }
    @Override
    public List<SysUser> findAllByMessage(Integer userId) {
        return sysUserMapper.selectFriendByMessage(userId);
    }

    @Override
    public void messageByUserId(Integer sender, Integer receiver) {

    }

    @Override
    public void saveMessage(UserMessage message) {
        userMessageMapper.insert(message);
    }

    @Override
    public List<SysUser> findAllMessageUsersByUserId(Integer userId) {
        List<SysUser> users = sysUserMapper.findAllMessageUsersByUserId(userId);
        return users;
    }

    @Override
    public List<UserMessage> findMessageByUserId(Integer sender, Integer receiver) {
        List<UserMessage> messages = userMessageMapper.findMessageByUserId(sender, receiver);
        return messages;
    }
}
