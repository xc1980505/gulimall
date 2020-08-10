package com.xc.gulimall.product.dao;

import com.xc.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-07 00:07:36
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
