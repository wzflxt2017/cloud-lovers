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
 * 心情记录表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserMoodRecord extends Model<UserMoodRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "record_id", type = IdType.AUTO)
    private Integer recordId;

    /**
     * 标题
     */
    private String recordTitle;

    /**
     * 多张图片id，以逗号分割
     */
    private String recordImages;

    /**
     * 正文
     */
    private String recordContent;

    /**
     * 上传者id
     */
    private Integer userId;

    /**
     * 记录时间
     */
    private LocalDateTime createTime;

    /**
     * 是否隐藏
     */
    private Integer isHidden;

    /**
     * 访问数量
     */
    private Integer visitorNumber;

    /**
     * 评论数量
     */
    private Integer commentNumber;

    /**
     * 获赞数量
     */
    private Integer approverNumber;


    @Override
    protected Serializable pkVal() {
        return this.recordId;
    }

}
