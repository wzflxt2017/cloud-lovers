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
 * 用户好友表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserFriend extends Model<UserFriend> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_friend_id", type = IdType.AUTO)
    private Integer userFriendId;

    /**
     * 所属用户id
     */
    private Integer userId;

    /**
     * 该朋友id
     */
    private Integer friendId;

    /**
     * 该朋友的名字
     */
    private String friendName;


    @Override
    protected Serializable pkVal() {
        return this.userFriendId;
    }

}
