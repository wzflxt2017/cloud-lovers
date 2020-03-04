package com.wangzefeng.lovers.base.mapper;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 22:21
 * @Description:
 * E:domain的类型
 * PK:domain主键类型
 */
public interface BaseMapper<E,PK> {
    int insert(E e);
    int deleteByPrimaryKey(PK pk);
    E selectByPrimaryKey(PK pk);
    int updateByPrimaryKey(E e);
}
