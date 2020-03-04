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
 * 情侣空间表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LoversSpace extends Model<LoversSpace> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "space_id", type = IdType.AUTO)
    private Integer spaceId;

    /**
     * 空间名称
     */
    private String spaceName;

    /**
     * 情侣中男id
     */
    private Integer userIdMan;

    /**
     * 情侣中女id
     */
    private Integer userIdWoman;

    /**
     * 背景图片id
     */
    private Integer spaceBackground;

    /**
     * 正文
     */
    private String spaceContent;

    /**
     * 空间创建时间
     */
    private LocalDateTime createTime;


    @Override
    protected Serializable pkVal() {
        return this.spaceId;
    }

}
