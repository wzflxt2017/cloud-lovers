package com.wangzefeng.lovers.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 流程业务表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkflowBusiness extends Model<WorkflowBusiness> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "business_id", type = IdType.AUTO)
    private Integer businessId;

    private Integer workflowId;

    private Integer dataId;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    private Integer createUserId;

    /**
     * 用户昵称
     */
    private String createUserName;

    /**
     * 状态
     */
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.businessId;
    }

}
