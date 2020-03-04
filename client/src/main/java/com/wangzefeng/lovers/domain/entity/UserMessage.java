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
 * 消息表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserMessage extends Model<UserMessage> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "message_id", type = IdType.AUTO)
    private Integer messageId;

    /**
     * 发送者id
     */
    private Integer senderId;

    /**
     * 接收者id
     */
    private Integer receiverId;

    /**
     * 信息类型：分为文字，图片或其他文件
     */
    private String messageType;

    /**
     * 消息正文
     */
    private String messageContent;

    /**
     * 消息状态（0：接收者未读，1：接收者已读，2：发送者已撤回，3：接收者已删除，4：发送者已删除,10:标记发送者将接收者放到消息栏）
     */
    private Integer isRead;

    /**
     * 文件名
     */
    private String messageFileName;

    /**
     * 文件id
     */
    private Integer messageFileId;

    /**
     * 消息发送时间
     */
    private LocalDateTime messageTime;


    @Override
    protected Serializable pkVal() {
        return this.messageId;
    }

}
