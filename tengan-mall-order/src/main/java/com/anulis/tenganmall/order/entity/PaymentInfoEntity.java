package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 付款資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_payment_info")
public class PaymentInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 訂單編號（對外交易編號）
	 */
	private String orderSn;
	/**
	 * 訂單ID
	 */
	private Long orderId;
	/**
	 * 支付寶交易流水號
	 */
	private String alipayTradeNo;
	/**
	 * 支付金額
	 */
	private BigDecimal totalAmount;
	/**
	 * 交易內容
	 */
	private String subject;
	/**
	 * 付款狀態
	 */
	private String paymentStatus;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 確認時間
	 */
	private Date confirmTime;
	/**
	 * 回呼內容
	 */
	private String callbackContent;
	/**
	 * 回呼時間
	 */
	private Date callbackTime;

}
