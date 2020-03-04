package com.wangzefeng.lovers.java.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer messageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.sender_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer senderId;

    private SysUser sender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.receiver_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer receiverId;

    private SysUser receiver;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_type
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_content
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.is_read
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer isRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_file_name
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private String messageFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_file_id
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Integer messageFileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_message.message_time
     *
     * @mbg.generated Wed Sep 25 10:59:33 CST 2019
     */
    private Date messageTime;

}