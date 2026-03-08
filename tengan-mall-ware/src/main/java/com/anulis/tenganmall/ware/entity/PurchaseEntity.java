package com.anulis.tenganmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 採購單
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
@Data
@TableName("wms_purchase")
public class PurchaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 採購單ID
	 */
	@TableId
	private Long id;
	/**
	 * 採購人ID
	 */
	private Long assigneeId;
	/**
	 * 採購人姓名
	 */
	private String assigneeName;
	/**
	 * 聯絡電話
	 */
	private String phone;
	/**
	 * 優先順序
	 */
	private Integer priority;
	/**
	 * 狀態
	 */
	private Integer status;
	/**
	 * 倉庫ID
	 */
	private Long wareId;
	/**
	 * 總金額
	 */
	private BigDecimal amount;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 更新時間
	 */
	private Date updateTime;

}
