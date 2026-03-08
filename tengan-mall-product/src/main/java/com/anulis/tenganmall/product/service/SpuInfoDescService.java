package com.anulis.tenganmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * SPU 商品介紹
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

