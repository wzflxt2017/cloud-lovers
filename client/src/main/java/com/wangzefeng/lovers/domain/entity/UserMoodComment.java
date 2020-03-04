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
 * 心情记录评论表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserMoodComment extends Model<UserMoodComment> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "comment_id", type = IdType.AUTO)
    private Integer commentId;

    /**
     * 心情记录id
     */
    private Integer recordId;

    /**
     * 正文
     */
    private String commentContent;

    /**
     * 评论人id
     */
    private Integer userId;

    /**
     * 评论时间
     */
    private LocalDateTime commentTime;


    @Override
    protected Serializable pkVal() {
        return this.commentId;
    }

}
