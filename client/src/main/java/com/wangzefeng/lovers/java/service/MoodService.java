package com.wangzefeng.lovers.java.service;

import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.domain.UserMoodRecord;

import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 21:13
 * @Description:
 */
public interface MoodService {
    List<UserMoodRecord> findPage(List<SysUser> sysUsers);

    int addOne(UserMoodRecord mood, SysUser sysUser);
}
