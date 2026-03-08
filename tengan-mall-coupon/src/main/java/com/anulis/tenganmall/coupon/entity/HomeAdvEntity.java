package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首頁輪播廣告
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_home_adv")
public class HomeAdvEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 名稱
	 */
	private String name;
	/**
	 * 圖片網址
	 */
	private String imageUrl;
	/**
	 * 開始時間
	 */
	private Date startTime;
	/**
	 * 結束時間
	 */
	private Date endTime;
	/**
	 * 狀態
	 */
	private Integer status;
	/**
	 * 點擊數
	 */
	private Integer clickCount;
	/**
	 * 廣告詳情連結
	 */
	private String linkUrl;
	/**
	 * 備註
	 */
	private String note;
	/**
	 * 排序
	 */
	private Integer sort;
	/**
	 * 發布者ID
	 */
	private Long publisherId;
	/**
	 * 審核者ID
	 */
	private Long auditorId;

}
