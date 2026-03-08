package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單設定
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 秒殺訂單逾時關閉時間（分鐘）
	 */
	private Integer flashOrderOvertime;
	/**
	 * 一般訂單逾時關閉時間（分鐘）
	 */
	private Integer normalOrderOvertime;
	/**
	 * 出貨後自動確認收貨天數
	 */
	private Integer confirmOvertime;
	/**
	 * 自動完成交易天數（逾期不可申請退貨）
	 */
	private Integer finishOvertime;
	/**
	 * 訂單完成後自動好評天數
	 */
	private Integer commentOvertime;
	/**
	 * 適用會員等級【0->不限；其他->對應會員等級】
	 */
	private Integer memberLevel;

}
