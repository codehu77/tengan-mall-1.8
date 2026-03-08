package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單操作紀錄
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order_operate_history")
public class OrderOperateHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 訂單ID
	 */
	private Long orderId;
	/**
	 * 操作人【使用者／系統／後台管理員】
	 */
	private String operateMan;
	/**
	 * 操作時間
	 */
	private Date createTime;
	/**
	 * 訂單狀態【0->待付款；1->待出貨；2->已出貨；3->已完成；4->已關閉；5->無效訂單】
	 */
	private Integer orderStatus;
	/**
	 * 備註
	 */
	private String note;

}
