package com.anulis.tenganmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品庫存
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
@Data
@TableName("wms_ware_sku")
public class WareSkuEntity implements Serializable {
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
	 * 倉庫ID
	 */
	private Long wareId;
	/**
	 * 庫存數量
	 */
	private Integer stock;
	/**
	 * SKU 名稱
	 */
	private String skuName;
	/**
	 * 鎖定庫存
	 */
	private Integer stockLocked;

}
