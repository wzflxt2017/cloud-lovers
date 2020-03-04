package com.wangzefeng.lovers.java.service.impl;

import com.wangzefeng.lovers.java.domain.SysFile;
import com.wangzefeng.lovers.java.domain.SysFileExample;
import com.wangzefeng.lovers.java.domain.SysUser;
import com.wangzefeng.lovers.java.mapper.SysFileMapper;
import com.wangzefeng.lovers.java.service.SysFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Auther: wangzefeng
 * @Date: 2019-09-28 16:46
 * @Description:
 */
@Service
public class SysFileServiceImpl implements SysFileService {


    @Value("${lovers.rootPath}")
    private String rootPath;

    @Autowired
    private SysFileMapper sysFileMapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId) {
        return sysFileMapper.deleteByPrimaryKey(fileId);
    }

    @Override
    public int insert(SysFile record) {
        return sysFileMapper.insert(record);
    }

    @Override
    public SysFile selectByPrimaryKey(Integer fileId) {
        return sysFileMapper.selectByPrimaryKey(fileId);
    }

    @Override
    public List<SysFile> selectByIds(String fileIds) {
        SysFileExample example = new SysFileExample();
        SysFileExample.Criteria criteria = example.createCriteria();
        String[] split = fileIds.split(",");
        List<Integer> ids=new ArrayList<>();
        for(String s:split){
            if(!StringUtils.isEmpty(s)){
                ids.add(Integer.parseInt(s));
            }
        }
        criteria.andFileIdIn(ids);
        return sysFileMapper.selectByExample(example);
    }

    @Override
    public int updateByPrimaryKey(SysFile record) {
        return sysFileMapper.updateByPrimaryKey(record);
    }

    @Override
    public SysFile uploadImageByModule(MultipartFile file, String module, SysUser sysUser) {
        String fileName = file.getOriginalFilename();
        String[] split = fileName.split("\\.");
        SysFile sysFile = new SysFile();
        sysFile.setFileFullName(fileName);
        sysFile.setFileSuffix("."+split[1]);
        sysFile.setFileName(split[0]);
        sysFile.setFileType(split[1]);
        sysFile.setForModule(module);
        sysFile.setUserId(sysUser.getUserId());
        sysFile.setUploadTime(Calendar.getInstance().getTime());
        int insert = insert(sysFile);
        try {
            File file1 = new File(rootPath+module+ File.separator+sysFile.getFileId()+"_"+sysFile.getFileFullName());

            file.transferTo(file1);
            return sysFile;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
