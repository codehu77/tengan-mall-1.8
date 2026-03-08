package com.anulis.tenganmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * SPU 資訊
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

