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
 * 用户相册表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserPhotoAlbum extends Model<UserPhotoAlbum> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "album_id", type = IdType.AUTO)
    private Integer albumId;

    /**
     * 相册名
     */
    private String albumName;

    /**
     * 相册封面
     */
    private Integer albumCover;

    /**
     * 相册描述
     */
    private String albumDescribe;

    /**
     * 创建者id
     */
    private Integer userId;

    /**
     * 相册创建时间
     */
    private LocalDateTime createTime;

    /**
     * 最后一次修改时间
     */
    private LocalDateTime modifiedTime;


    @Override
    protected Serializable pkVal() {
        return this.albumId;
    }

}
