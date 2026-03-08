package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 屬性分組
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_attr_group")
public class AttrGroupEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 分組ID
	 */
	@TableId
	private Long attrGroupId;
	/**
	 * 分組名稱
	 */
	private String attrGroupName;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 說明
	 */
	private String descript;
	/**
	 * 分組圖示
	 */
	private String icon;
	/**
	 * 所屬分類ID
	 */
	private Long catalogId;

}
