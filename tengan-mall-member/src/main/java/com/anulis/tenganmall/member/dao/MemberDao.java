package com.anulis.tenganmall.member.dao;

import com.anulis.tenganmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 會員資料
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
