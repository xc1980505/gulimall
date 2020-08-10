package com.xc.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.common.utils.PageUtils;
import com.xc.gulimall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-07 00:07:36
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

