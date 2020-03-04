package com.wangzefeng.lovers.java.mapper;

import com.wangzefeng.lovers.java.domain.LoversActionWorkflow;
import com.wangzefeng.lovers.java.domain.LoversActionWorkflowExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoversActionWorkflowMapper {

    long countByExample(LoversActionWorkflowExample example);

    int deleteByExample(LoversActionWorkflowExample example);

    int deleteByPrimaryKey(Integer actionId);

    int insert(LoversActionWorkflow record);

    int insertSelective(LoversActionWorkflow record);

    List<LoversActionWorkflow> selectByExample(LoversActionWorkflowExample example);

    LoversActionWorkflow selectByPrimaryKey(Integer actionId);

    int updateByExampleSelective(@Param("record") LoversActionWorkflow record, @Param("example") LoversActionWorkflowExample example);

    int updateByExample(@Param("record") LoversActionWorkflow record, @Param("example") LoversActionWorkflowExample example);

    int updateByPrimaryKeySelective(LoversActionWorkflow record);

    int updateByPrimaryKey(LoversActionWorkflow record);
}