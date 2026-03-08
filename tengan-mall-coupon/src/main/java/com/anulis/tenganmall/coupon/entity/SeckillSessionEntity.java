package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 秒殺場次
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_seckill_session")
public class SeckillSessionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 場次名稱
	 */
	private String name;
	/**
	 * 每日開始時間
	 */
	private Date startTime;
	/**
	 * 每日結束時間
	 */
	private Date endTime;
	/**
	 * 啟用狀態
	 */
	private Integer status;
	/**
	 * 建立時間
	 */
	private Date createTime;

}
