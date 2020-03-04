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
 * 流程任务表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkflowTask extends Model<WorkflowTask> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "task_id", type = IdType.AUTO)
    private Integer taskId;

    private Integer businessId;

    private Integer startUserId;

    /**
     * 用户昵称
     */
    private String startUserName;

    /**
     * 任务开始时间
     */
    private LocalDateTime startTime;

    private Integer endUserId;

    /**
     * 用户昵称
     */
    private String endUserName;

    /**
     * 任务结束时间
     */
    private LocalDateTime endTime;

    private Integer nodeId;

    private Integer linkId;

    /**
     * 状态
     */
    private Integer status;


    @Override
    protected Serializable pkVal() {
        return this.taskId;
    }

}
