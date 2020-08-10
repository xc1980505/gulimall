package com.xc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.common.utils.PageUtils;
import com.xc.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-07 00:07:36
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

