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
 * 用户照片表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserPhoto extends Model<UserPhoto> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "photo_id", type = IdType.AUTO)
    private Integer photoId;

    /**
     * 相册id
     */
    private Integer albumId;

    /**
     * 图片名称
     */
    private String photoName;

    /**
     * 图片位置
     */
    private String photoPosition;

    /**
     * 图片描述
     */
    private String photoDescribe;

    /**
     * 上传时间
     */
    private LocalDateTime uploadTime;

    /**
     * 上传者id
     */
    private Integer userId;

    /**
     * 所属模块
     */
    private String forModule;


    @Override
    protected Serializable pkVal() {
        return this.photoId;
    }

}
