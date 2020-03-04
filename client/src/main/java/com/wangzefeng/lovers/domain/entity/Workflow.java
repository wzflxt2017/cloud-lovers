package com.wangzefeng.lovers.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 流程类型表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Workflow extends Model<Workflow> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "workflow_id", type = IdType.AUTO)
    private Integer workflowId;

    /**
     * 流程key
     */
    private String workflowKey;

    /**
     * 流程名称
     */
    private String workflowName;

    /**
     * 流程类型描述
     */
    private String workflowDescribe;

    /**
     * 用于排序
     */
    private Integer orderNumber;


    @Override
    protected Serializable pkVal() {
        return this.workflowId;
    }

}
