package com.bupt.gulimall.order.dao;

import com.bupt.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author huyangye
 * @email huyangye@gmail.com
 * @date 2023-02-12 14:09:34
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
