package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SPU 資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_spu_info")
public class SpuInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品ID（SPU）
	 */
	@TableId
	private Long id;
	/**
	 * 商品名稱
	 */
	private String spuName;
	/**
	 * 商品描述
	 */
	private String spuDescription;
	/**
	 * 所屬分類ID
	 */
	private Long catalogId;
	/**
	 * 品牌ID
	 */
	private Long brandId;
	/**
	 * 重量
	 */
	private BigDecimal weight;
	/**
	 * 上架狀態【0->下架；1->上架】
	 */
	private Integer publishStatus;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 更新時間
	 */
	private Date updateTime;

}
