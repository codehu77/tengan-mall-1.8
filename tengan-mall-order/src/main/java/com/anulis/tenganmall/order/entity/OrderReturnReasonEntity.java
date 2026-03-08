package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退貨原因
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order_return_reason")
public class OrderReturnReasonEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 退貨原因名稱
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 啟用狀態
	 */
	private Integer status;
	/**
	 * 建立時間
	 */
	private Date createTime;

}
