package com.wangzefeng.lovers.base.domain;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-27 09:55
 * @Description:
 */
public interface BaseDomain<PK> {

    PK getId();

    void setId(PK id);
}
