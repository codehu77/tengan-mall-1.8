package com.anulis.tenganmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.anulis.tenganmall.common.utils.PageUtils;
import com.anulis.tenganmall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 會員登入紀錄
 *
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

