package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SPU 商品介紹
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_spu_info_desc")
public class SpuInfoDescEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商品ID（SPU）
	 */
	@TableId
	private Long spuId;
	/**
	 * 商品介紹
	 */
	private String decript;

}
