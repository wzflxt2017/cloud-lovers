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
 * 流程线表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkflowLink extends Model<WorkflowLink> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "link_id", type = IdType.AUTO)
    private Integer linkId;

    private Integer workflowId;

    /**
     * 流程线名称
     */
    private String linkName;

    /**
     * 流程线key
     */
    private String linkKey;

    private Integer linkPreNode;

    private Integer linkNextNode;


    @Override
    protected Serializable pkVal() {
        return this.linkId;
    }

}
