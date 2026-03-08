package com.anulis.tenganmall.product.dao;

import com.anulis.tenganmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分類（第 3 層分類）
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
