package com.anulis.tenganmall.member.dao;

import com.anulis.tenganmall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 會員點數變更紀錄
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
