package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺商品通知訂閱
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_seckill_sku_notice")
public class SeckillSkuNoticeEntity implements Serializable {
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
	 * SKU ID
	 */
	private Long skuId;
	/**
	 * 場次ID
	 */
	private Long sessionId;
	/**
	 * 訂閱時間
	 */
	private Date subscribeTime;
	/**
	 * 發送時間
	 */
	private Date sendTime;
	/**
	 * 通知方式【0->簡訊；1->Email】
	 */
	private Integer noticeType;

}
