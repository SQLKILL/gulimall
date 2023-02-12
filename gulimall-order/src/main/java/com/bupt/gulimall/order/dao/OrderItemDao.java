package com.bupt.gulimall.order.dao;

import com.bupt.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author huyangye
 * @email huyangye@gmail.com
 * @date 2023-02-12 14:09:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
