package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首頁專題
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_home_subject")
public class HomeSubjectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 專題名稱
	 */
	private String name;
	/**
	 * 專題標題
	 */
	private String title;
	/**
	 * 專題副標題
	 */
	private String subtitle;
	/**
	 * 顯示狀態
	 */
	private Integer status;
	/**
	 * 詳情連結
	 */
	private String url;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 專題圖片網址
	 */
	private String img;

}
