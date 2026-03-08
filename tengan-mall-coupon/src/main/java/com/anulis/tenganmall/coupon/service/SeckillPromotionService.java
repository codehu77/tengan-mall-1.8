package com.anulis.tenganmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒殺活動
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

