package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SKU 資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_sku_info")
public class SkuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * SKU ID
	 */
	@TableId
	private Long skuId;
	/**
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * SKU 名稱
	 */
	private String skuName;
	/**
	 * SKU 介紹
	 */
	private String skuDesc;
	/**
	 * 所屬分類ID
	 */
	private Long catalogId;
	/**
	 * 品牌ID
	 */
	private Long brandId;
	/**
	 * 預設圖片
	 */
	private String skuDefaultImg;
	/**
	 * 標題
	 */
	private String skuTitle;
	/**
	 * 副標題
	 */
	private String skuSubtitle;
	/**
	 * 價格
	 */
	private BigDecimal price;
	/**
	 * 銷量
	 */
	private Long saleCount;

}
