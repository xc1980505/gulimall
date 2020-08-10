package com.xc.gulimall.order.dao;

import com.xc.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-09 20:53:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
