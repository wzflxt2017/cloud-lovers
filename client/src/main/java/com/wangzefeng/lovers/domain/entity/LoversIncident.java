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
 * 情侣事件表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LoversIncident extends Model<LoversIncident> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "incident_id", type = IdType.AUTO)
    private Integer incidentId;

    /**
     * 标题
     */
    private String incidentTitle;

    /**
     * 正文
     */
    private String incidentContent;

    /**
     * 事件发生时间
     */
    private LocalDateTime incidentTime;

    /**
     * 记录创建时间
     */
    private LocalDateTime incidentCreateTime;

    /**
     * 情侣中男id
     */
    private Integer userIdMan;

    /**
     * 情侣中女id
     */
    private Integer userIdWoman;

    /**
     * 创建人id
     */
    private Integer userIdCreate;

    /**
     * 多张图片id
     */
    private String incidentImages;


    @Override
    protected Serializable pkVal() {
        return this.incidentId;
    }

}
