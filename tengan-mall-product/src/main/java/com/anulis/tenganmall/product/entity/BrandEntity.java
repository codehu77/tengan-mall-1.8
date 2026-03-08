package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 品牌
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌ID
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名稱
	 */
	private String name;
	/**
	 * 品牌Logo網址
	 */
	private String logo;
	/**
	 * 品牌介紹
	 */
	private String descript;
	/**
	 * 顯示狀態【0->不顯示；1->顯示】
	 */
	private Integer showStatus;
	/**
	 * 檢索首字母
	 */
	private String firstLetter;
	/**
	 * 排序
	 */
	private Integer sort;

}
