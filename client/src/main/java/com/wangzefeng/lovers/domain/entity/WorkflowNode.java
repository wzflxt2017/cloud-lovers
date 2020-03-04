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
 * 流程节点表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class WorkflowNode extends Model<WorkflowNode> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "node_id", type = IdType.AUTO)
    private Integer nodeId;

    /**
     * 节点key
     */
    private String nodeKey;

    private Integer workflowId;

    /**
     * 节点名称
     */
    private String nodeName;


    @Override
    protected Serializable pkVal() {
        return this.nodeId;
    }

}
