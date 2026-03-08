package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單商品明細
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order_item")
public class OrderItemEntity implements Serializable {
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
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * SPU 名稱
	 */
	private String spuName;
	/**
	 * SPU 圖片
	 */
	private String spuPic;
	/**
	 * 品牌
	 */
	private String spuBrand;
	/**
	 * 商品分類ID
	 */
	private Long categoryId;
	/**
	 * SKU ID
	 */
	private Long skuId;
	/**
	 * SKU 名稱
	 */
	private String skuName;
	/**
	 * SKU 圖片
	 */
	private String skuPic;
	/**
	 * SKU 單價
	 */
	private BigDecimal skuPrice;
	/**
	 * 購買數量
	 */
	private Integer skuQuantity;
	/**
	 * 銷售屬性組合（JSON）
	 */
	private String skuAttrsVals;
	/**
	 * 促銷折扣分攤金額
	 */
	private BigDecimal promotionAmount;
	/**
	 * 優惠券折扣分攤金額
	 */
	private BigDecimal couponAmount;
	/**
	 * 點數折扣分攤金額
	 */
	private BigDecimal integrationAmount;
	/**
	 * 折扣後實付分攤金額
	 */
	private BigDecimal realAmount;
	/**
	 * 贈送點數
	 */
	private Integer giftIntegration;
	/**
	 * 贈送成長值
	 */
	private Integer giftGrowth;

}
