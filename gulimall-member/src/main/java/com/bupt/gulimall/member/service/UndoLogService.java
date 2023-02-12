package com.bupt.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bupt.gulimall.common.utils.PageUtils;
import com.bupt.gulimall.member.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author huyangye
 * @email huyangye@gmail.com
 * @date 2023-02-12 13:59:14
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

