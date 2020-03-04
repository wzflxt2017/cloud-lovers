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
 * 用户表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 账号名
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户昵称
     */
    private String userName;

    /**
     * 用户姓名
     */
    private String fullName;

    /**
     * 个性签名
     */
    private String userBio;

    /**
     * 用户性别
     */
    private Integer userGender;

    /**
     * 用户等级
     */
    private Integer userLevel;

    /**
     * 用户在家庭的角色
     */
    private String userRole;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户生日
     */
    private LocalDateTime userBirthday;

    /**
     * 用户地址
     */
    private String userAddress;

    /**
     * 用户所在地
     */
    private String userLocation;

    /**
     * 用户头像
     */
    private Integer userPhoto;

    /**
     * 用户状态:1为可用，2为不可用
     */
    private Integer userState;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后一次修改时间
     */
    private LocalDateTime modifiedTime;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
