package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 專題商品（SPU）
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_home_subject_spu")
public class HomeSubjectSpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 專題名稱
	 */
	private String subjectName;
	/**
	 * 專題ID
	 */
	private Long subjectId;
	/**
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * 排序
	 */
	private Integer sort;

}
