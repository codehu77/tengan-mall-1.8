package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SKU 階梯價
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_sku_ladder")
public class SkuLadderEntity implements Serializable {
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
	 * 滿幾件
	 */
	private Integer fullCount;
	/**
	 * 折扣（例如 8.50 表示 85 折）
	 */
	private BigDecimal discount;
	/**
	 * 折後價
	 */
	private BigDecimal price;
	/**
	 * 是否可疊加其他優惠【0->不可；1->可】
	 */
	private Integer canStackWithOther;

}
