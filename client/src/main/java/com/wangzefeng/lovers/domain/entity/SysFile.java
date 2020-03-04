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
 * 文件表
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysFile extends Model<SysFile> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "file_id", type = IdType.AUTO)
    private Integer fileId;

    /**
     * 文件名
     */
    private String fileName;

    /**
     * 文件后缀
     */
    private String fileSuffix;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件全名
     */
    private String fileFullName;

    /**
     * 所属模块
     */
    private String forModule;

    /**
     * 上传文件的用户
     */
    private Integer userId;

    /**
     * 上传时间
     */
    private LocalDateTime uploadTime;


    @Override
    protected Serializable pkVal() {
        return this.fileId;
    }

}
