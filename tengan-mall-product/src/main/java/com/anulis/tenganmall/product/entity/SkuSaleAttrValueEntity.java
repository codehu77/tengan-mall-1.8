package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SKU 銷售屬性與值
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_sku_sale_attr_value")
public class SkuSaleAttrValueEntity implements Serializable {
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
	 * 屬性ID
	 */
	private Long attrId;
	/**
	 * 銷售屬性名稱
	 */
	private String attrName;
	/**
	 * 銷售屬性值
	 */
	private String attrValue;
	/**
	 * 排序
	 */
	private Integer attrSort;

}
