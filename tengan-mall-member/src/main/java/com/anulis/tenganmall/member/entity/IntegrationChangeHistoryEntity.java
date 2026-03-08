package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員點數變更紀錄
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 會員ID
	 */
	private Long memberId;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 變更點數
	 */
	private Integer changeCount;
	/**
	 * 備註
	 */
	private String note;
	/**
	 * 來源【0->購物；1->管理員修改；2->活動】
	 */
	private Integer sourceType;

}
