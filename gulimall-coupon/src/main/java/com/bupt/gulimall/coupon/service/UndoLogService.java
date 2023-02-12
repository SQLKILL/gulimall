package com.bupt.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bupt.gulimall.common.utils.PageUtils;
import com.bupt.gulimall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * @author huyangye
 * @email huyangye@gmail.com
 * @date 2023-02-12 13:47:30
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

