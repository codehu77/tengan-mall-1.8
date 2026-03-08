package com.anulis.tenganmall.order.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 訂單
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 21:11:14
 */
@Data
@TableName("oms_order")
public class OrderEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 會員ID
	 */
	private Long memberId;
	/**
	 * 訂單編號
	 */
	private String orderSn;
	/**
	 * 使用的優惠券ID
	 */
	private Long couponId;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 會員帳號
	 */
	private String memberUsername;
	/**
	 * 訂單總金額
	 */
	private BigDecimal totalAmount;
	/**
	 * 應付金額
	 */
	private BigDecimal payAmount;
	/**
	 * 運費
	 */
	private BigDecimal freightAmount;
	/**
	 * 促銷折抵金額（促銷價、滿額折扣、階梯價）
	 */
	private BigDecimal promotionAmount;
	/**
	 * 點數折抵金額
	 */
	private BigDecimal integrationAmount;
	/**
	 * 優惠券折抵金額
	 */
	private BigDecimal couponAmount;
	/**
	 * 後台調整折扣金額
	 */
	private BigDecimal discountAmount;
	/**
	 * 付款方式【1->支付寶；2->微信支付；3->銀聯；4->貨到付款】
	 */
	private Integer payType;
	/**
	 * 訂單來源【0->PC；1->App】
	 */
	private Integer sourceType;
	/**
	 * 訂單狀態【0->待付款；1->待出貨；2->已出貨；3->已完成；4->已關閉；5->無效訂單】
	 */
	private Integer status;
	/**
	 * 配送公司（配送方式）
	 */
	private String deliveryCompany;
	/**
	 * 配送單號
	 */
	private String deliverySn;
	/**
	 * 自動確認收貨天數
	 */
	private Integer autoConfirmDay;
	/**
	 * 可獲得點數
	 */
	private Integer integration;
	/**
	 * 可獲得成長值
	 */
	private Integer growth;
	/**
	 * 發票類型【0->不開立；1->電子發票；2->紙本發票】
	 */
	private Integer billType;
	/**
	 * 發票抬頭
	 */
	private String billHeader;
	/**
	 * 發票內容
	 */
	private String billContent;
	/**
	 * 收票人電話
	 */
	private String billReceiverPhone;
	/**
	 * 收票人Email
	 */
	private String billReceiverEmail;
	/**
	 * 收件人姓名
	 */
	private String receiverName;
	/**
	 * 收件人電話
	 */
	private String receiverPhone;
	/**
	 * 郵遞區號
	 */
	private String receiverPostCode;
	/**
	 * 縣市/直轄市
	 */
	private String receiverProvince;
	/**
	 * 城市/鄉鎮市區
	 */
	private String receiverCity;
	/**
	 * 行政區
	 */
	private String receiverRegion;
	/**
	 * 詳細地址
	 */
	private String receiverDetailAddress;
	/**
	 * 訂單備註
	 */
	private String note;
	/**
	 * 收貨確認狀態【0->未確認；1->已確認】
	 */
	private Integer confirmStatus;
	/**
	 * 刪除狀態【0->未刪除；1->已刪除】
	 */
	private Integer deleteStatus;
	/**
	 * 下單使用點數
	 */
	private Integer useIntegration;
	/**
	 * 付款時間
	 */
	private Date paymentTime;
	/**
	 * 出貨時間
	 */
	private Date deliveryTime;
	/**
	 * 確認收貨時間
	 */
	private Date receiveTime;
	/**
	 * 評價時間
	 */
	private Date commentTime;
	/**
	 * 修改時間
	 */
	private Date modifyTime;

}
