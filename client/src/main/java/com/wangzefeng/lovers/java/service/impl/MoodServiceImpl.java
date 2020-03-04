package com.wangzefeng.lovers.java.service.impl;

import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.domain.UserMoodRecord;
import com.wangzefeng.lovers.java.mapper.UserMoodRecordMapper;
import com.wangzefeng.lovers.java.service.MoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 21:14
 * @Description:
 */
@Service
public class MoodServiceImpl  implements MoodService {

    @Autowired
    UserMoodRecordMapper userMoodRecordMapper;

    @Override
    public List<UserMoodRecord> findPage(List<SysUser> sysUsers) {
        List<UserMoodRecord> userMoodRecords = userMoodRecordMapper.selectByUsers(sysUsers);
        return userMoodRecords;
    }

    @Override
    public int addOne(UserMoodRecord mood,SysUser sysUser) {
        mood.setCreateTime(Calendar.getInstance().getTime());
        mood.setUserId(sysUser.getUserId());
        int i= userMoodRecordMapper.insert(mood);
        return i;
    }
}
