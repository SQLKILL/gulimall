package com.bupt.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bupt.gulimall.common.utils.PageUtils;
import com.bupt.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author huyangye
 * @email huyangye@gmail.com
 * @date 2023-02-12 13:59:14
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

