package com.wangzefeng.lovers.base.service.impl;

import com.lovers.base.mapper.BaseMapper;
import com.lovers.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 22:27
 * @Description:
 */
public class BaseServiceImpl<E,PK> implements BaseService<E,PK> {

    @Autowired
    protected BaseMapper<E,PK> baseMapper;

    @Override
    public int insert(E e) {
        return baseMapper.insert(e);
    }

    @Override
    public int deleteByPrimaryKey(PK pk) {
        return baseMapper.deleteByPrimaryKey(pk);
    }

    @Override
    public E selectByPrimaryKey(PK pk) {
        return baseMapper.selectByPrimaryKey(pk);
    }

    @Override
    public int updateByPrimaryKey(E e) {
        return baseMapper.updateByPrimaryKey(e);
    }
}
