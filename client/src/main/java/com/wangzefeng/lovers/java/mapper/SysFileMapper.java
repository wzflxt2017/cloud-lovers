package com.wangzefeng.lovers.java.mapper;

import com.wangzefeng.lovers.java.domain.SysFile;
import com.wangzefeng.lovers.java.domain.SysFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysFileMapper {

    long countByExample(SysFileExample example);


    int deleteByExample(SysFileExample example);


    int deleteByPrimaryKey(Integer fileId);

    int insert(SysFile record);


    int insertSelective(SysFile record);

    List<SysFile> selectByExample(SysFileExample example);

    SysFile selectByPrimaryKey(Integer fileId);


    int updateByExampleSelective(@Param("record") SysFile record, @Param("example") SysFileExample example);


    int updateByExample(@Param("record") SysFile record, @Param("example") SysFileExample example);


    int updateByPrimaryKeySelective(SysFile record);

    int updateByPrimaryKey(SysFile record);
}