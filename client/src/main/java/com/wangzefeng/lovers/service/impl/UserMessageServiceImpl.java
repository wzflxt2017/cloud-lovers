package com.wangzefeng.lovers.service.impl;

import com.wangzefeng.lovers.domain.entity.UserMessage;
import com.wangzefeng.lovers.mapper.UserMessageMapper;
import com.wangzefeng.lovers.service.UserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息表 服务实现类
 * </p>
 *
 * @author wangzefeng
 * @since 2020-03-04
 */
@Service
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
