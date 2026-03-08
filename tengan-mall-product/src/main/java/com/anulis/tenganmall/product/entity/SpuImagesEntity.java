package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SPU 圖片
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_spu_images")
public class SpuImagesEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * 圖片名稱
	 */
	private String imgName;
	/**
	 * 圖片網址
	 */
	private String imgUrl;
	/**
	 * 排序
	 */
	private Integer imgSort;
	/**
	 * 是否為預設圖
	 */
	private Integer defaultImg;

}
