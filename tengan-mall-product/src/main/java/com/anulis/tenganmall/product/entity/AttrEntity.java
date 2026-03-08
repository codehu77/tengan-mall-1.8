package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品屬性
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_attr")
public class AttrEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 屬性ID
	 */
	@TableId
	private Long attrId;
	/**
	 * 屬性名稱
	 */
	private String attrName;
	/**
	 * 是否需要檢索【0->不需要；1->需要】
	 */
	private Integer searchType;
	/**
	 * 值類型【0->單一值；1->可選多個值】
	 */
	private Integer valueType;
	/**
	 * 屬性圖示
	 */
	private String icon;
	/**
	 * 可選值清單（逗號分隔）
	 */
	private String valueSelect;
	/**
	 * 屬性類型【0->銷售屬性；1->基本屬性；2->同時為銷售與基本屬性】
	 */
	private Integer attrType;
	/**
	 * 啟用狀態【0->停用；1->啟用】
	 */
	private Integer enable;
	/**
	 * 所屬分類ID
	 */
	private Long catalogId;
	/**
	 * 快速展示【是否顯示在介紹上；0->否；1->是】（SKU 仍可調整）
	 */
	private Integer showDesc;

}
