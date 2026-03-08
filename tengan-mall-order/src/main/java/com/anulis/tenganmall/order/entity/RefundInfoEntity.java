package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 退款資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_refund_info")
public class RefundInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 退貨申請ID
	 */
	private Long orderReturnId;
	/**
	 * 退款金額
	 */
	private BigDecimal refund;
	/**
	 * 退款交易流水號
	 */
	private String refundSn;
	/**
	 * 退款狀態
	 */
	private Integer refundStatus;
	/**
	 * 退款管道【1->支付寶；2->微信支付；3->銀聯；4->匯款】
	 */
	private Integer refundChannel;
	/**
	 * 退款說明
	 */
	private String refundContent;

}
