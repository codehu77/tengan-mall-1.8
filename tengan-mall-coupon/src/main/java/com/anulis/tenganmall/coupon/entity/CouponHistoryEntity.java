package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 優惠券領取/使用紀錄
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_coupon_history")
public class CouponHistoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 優惠券ID
	 */
	private Long couponId;
	/**
	 * 會員ID
	 */
	private Long memberId;
	/**
	 * 會員暱稱
	 */
	private String memberNickname;
	/**
	 * 取得方式【0->後台贈送；1->自行領取】
	 */
	private Integer getType;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 使用狀態【0->未使用；1->已使用；2->已過期】
	 */
	private Integer useStatus;
	/**
	 * 使用時間
	 */
	private Date useTime;
	/**
	 * 訂單ID
	 */
	private Long orderId;
	/**
	 * 訂單編號
	 */
	private String orderSn;

}
