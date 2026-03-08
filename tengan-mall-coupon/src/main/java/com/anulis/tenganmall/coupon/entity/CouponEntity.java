package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 優惠券資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_coupon")
public class CouponEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 優惠券類型【0->全站發放；1->會員發放；2->購物發放；3->註冊發放】
	 */
	private Integer couponType;
	/**
	 * 優惠券圖片
	 */
	private String couponImg;
	/**
	 * 優惠券名稱
	 */
	private String couponName;
	/**
	 * 數量
	 */
	private Integer num;
	/**
	 * 金額
	 */
	private BigDecimal amount;
	/**
	 * 每人限領張數
	 */
	private Integer perLimit;
	/**
	 * 使用門檻（滿額）
	 */
	private BigDecimal minPoint;
	/**
	 * 開始時間
	 */
	private Date startTime;
	/**
	 * 結束時間
	 */
	private Date endTime;
	/**
	 * 使用範圍【0->全站通用；1->指定分類；2->指定商品】
	 */
	private Integer useType;
	/**
	 * 備註
	 */
	private String note;
	/**
	 * 發行數量
	 */
	private Integer publishCount;
	/**
	 * 已使用數量
	 */
	private Integer useCount;
	/**
	 * 已領取數量
	 */
	private Integer receiveCount;
	/**
	 * 可領取開始時間
	 */
	private Date enableStartTime;
	/**
	 * 可領取結束時間
	 */
	private Date enableEndTime;
	/**
	 * 優惠碼
	 */
	private String code;
	/**
	 * 可領取會員等級【0->不限；其他->對應等級】
	 */
	private Integer memberLevel;
	/**
	 * 發布狀態【0->未發布；1->已發布】
	 */
	private Integer publish;

}
