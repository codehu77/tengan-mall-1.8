package com.anulis.tenganmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品庫存
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

