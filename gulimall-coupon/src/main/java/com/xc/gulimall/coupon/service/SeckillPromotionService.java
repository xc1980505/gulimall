package com.xc.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.common.utils.PageUtils;
import com.xc.gulimall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-09 21:01:56
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

