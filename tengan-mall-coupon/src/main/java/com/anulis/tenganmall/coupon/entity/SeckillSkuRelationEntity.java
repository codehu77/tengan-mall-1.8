package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺活動商品關聯
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 活動ID
	 */
	private Long promotionId;
	/**
	 * 場次ID
	 */
	private Long promotionSessionId;
	/**
	 * SKU ID
	 */
	private Long skuId;
	/**
	 * 秒殺價
	 */
	private BigDecimal seckillPrice;
	/**
	 * 秒殺總量
	 */
	private BigDecimal seckillCount;
	/**
	 * 每人限購數量
	 */
	private BigDecimal seckillLimit;
	/**
	 * 排序
	 */
	private Integer seckillSort;

}
