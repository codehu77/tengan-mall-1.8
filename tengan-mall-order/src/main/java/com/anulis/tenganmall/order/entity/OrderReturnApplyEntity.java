package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單退貨申請
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order_return_apply")
public class OrderReturnApplyEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 訂單ID
	 */
	private Long orderId;
	/**
	 * 退貨商品SKU ID
	 */
	private Long skuId;
	/**
	 * 訂單編號
	 */
	private String orderSn;
	/**
	 * 申請時間
	 */
	private Date createTime;
	/**
	 * 會員帳號
	 */
	private String memberUsername;
	/**
	 * 退款金額
	 */
	private BigDecimal returnAmount;
	/**
	 * 退貨人姓名
	 */
	private String returnName;
	/**
	 * 退貨人電話
	 */
	private String returnPhone;
	/**
	 * 申請狀態【0->待處理；1->退貨處理中；2->已完成；3->已拒絕】
	 */
	private Integer status;
	/**
	 * 處理時間
	 */
	private Date handleTime;
	/**
	 * 商品圖片
	 */
	private String skuImg;
	/**
	 * 商品名稱
	 */
	private String skuName;
	/**
	 * 商品品牌
	 */
	private String skuBrand;
	/**
	 * 銷售屬性（JSON）
	 */
	private String skuAttrsVals;
	/**
	 * 退貨數量
	 */
	private Integer skuCount;
	/**
	 * 商品單價
	 */
	private BigDecimal skuPrice;
	/**
	 * 實際支付單價
	 */
	private BigDecimal skuRealPrice;
	/**
	 * 退貨原因
	 */
	private String reason;
	/**
	 * 問題描述
	 */
	private String description;
	/**
	 * 憑證圖片（逗號分隔）
	 */
	private String descPics;
	/**
	 * 處理備註
	 */
	private String handleNote;
	/**
	 * 處理人員
	 */
	private String handleMan;
	/**
	 * 收件人
	 */
	private String receiveMan;
	/**
	 * 收貨時間
	 */
	private Date receiveTime;
	/**
	 * 收貨備註
	 */
	private String receiveNote;
	/**
	 * 收貨電話
	 */
	private String receivePhone;
	/**
	 * 公司退貨地址
	 */
	private String companyAddress;

}
