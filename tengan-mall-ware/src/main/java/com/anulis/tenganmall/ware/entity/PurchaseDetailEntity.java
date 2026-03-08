package com.anulis.tenganmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 採購單明細
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
@Data
@TableName("wms_purchase_detail")
public class PurchaseDetailEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 採購單ID
	 */
	private Long purchaseId;
	/**
	 * 採購商品SKU ID
	 */
	private Long skuId;
	/**
	 * 採購數量
	 */
	private Integer skuNum;
	/**
	 * 採購金額
	 */
	private BigDecimal skuPrice;
	/**
	 * 倉庫ID
	 */
	private Long wareId;
	/**
	 * 狀態【0->新建；1->已分配；2->採購中；3->已完成；4->採購失敗】
	 */
	private Integer status;

}
