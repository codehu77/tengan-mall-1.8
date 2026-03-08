package com.anulis.tenganmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 庫存工作單明細
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

