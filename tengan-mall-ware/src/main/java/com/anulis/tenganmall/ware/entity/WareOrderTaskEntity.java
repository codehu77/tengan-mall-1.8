package com.anulis.tenganmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 庫存工作單
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
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
	 * 訂單編號
	 */
	private String orderSn;
	/**
	 * 收件人
	 */
	private String consignee;
	/**
	 * 收件人電話
	 */
	private String consigneePhone;
	/**
	 * 配送地址
	 */
	private String deliveryAddress;
	/**
	 * 訂單備註
	 */
	private String orderNote;
	/**
	 * 付款方式【1->線上付款；2->貨到付款】
	 */
	private Integer paymentMethod;
	/**
	 * 任務狀態
	 */
	private Integer taskStatus;
	/**
	 * 訂單描述
	 */
	private String orderDescription;
	/**
	 * 物流單號
	 */
	private String trackingNumber;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 倉庫ID
	 */
	private Long wareId;
	/**
	 * 工作單備註
	 */
	private String taskNote;

}
