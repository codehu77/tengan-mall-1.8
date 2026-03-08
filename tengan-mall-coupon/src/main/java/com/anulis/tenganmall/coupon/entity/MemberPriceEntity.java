package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品會員價
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_member_price")
public class MemberPriceEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * SKU ID
	 */
	private Long skuId;
	/**
	 * 會員等級ID
	 */
	private Long memberLevelId;
	/**
	 * 會員等級名稱
	 */
	private String memberLevelName;
	/**
	 * 會員價
	 */
	private BigDecimal memberPrice;
	/**
	 * 是否可疊加其他優惠【0->不可；1->可】
	 */
	private Integer canStackWithOther;

}
