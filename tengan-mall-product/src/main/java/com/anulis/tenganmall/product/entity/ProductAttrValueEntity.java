package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SPU 屬性值
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_product_attr_value")
public class ProductAttrValueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 商品ID（SPU）
	 */
	private Long spuId;
	/**
	 * 屬性ID
	 */
	private Long attrId;
	/**
	 * 屬性名稱
	 */
	private String attrName;
	/**
	 * 屬性值
	 */
	private String attrValue;
	/**
	 * 排序
	 */
	private Integer attrSort;
	/**
	 * 快速展示【是否顯示在介紹上；0->否；1->是】
	 */
	private Integer quickShow;

}
