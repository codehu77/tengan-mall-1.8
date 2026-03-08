package com.anulis.tenganmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品屬性
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

