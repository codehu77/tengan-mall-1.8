package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品分類（第 3 層分類）
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分類ID
	 */
	@TableId
	private Long catId;
	/**
	 * 分類名稱
	 */
	private String name;
	/**
	 * 上層分類ID
	 */
	private Long parentCid;
	/**
	 * 層級
	 */
	private Integer catLevel;
	/**
	 * 是否顯示【0->不顯示；1->顯示】
	 */
	private Integer showStatus;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 圖示網址
	 */
	private String icon;
	/**
	 * 計量單位
	 */
	private String productUnit;
	/**
	 * 商品數量
	 */
	private Integer productCount;

}
