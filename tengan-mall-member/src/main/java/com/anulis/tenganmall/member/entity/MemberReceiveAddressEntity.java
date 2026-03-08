package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員收件地址
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_member_receive_address")
public class MemberReceiveAddressEntity implements Serializable {
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
	 * 收件人姓名
	 */
	private String name;
	/**
	 * 電話
	 */
	private String phone;
	/**
	 * 郵遞區號
	 */
	private String postCode;
	/**
	 * 縣市
	 */
	private String province;
	/**
	 * 城市
	 */
	private String city;
	/**
	 * 行政區
	 */
	private String region;
	/**
	 * 詳細地址
	 */
	private String detailAddress;
	/**
	 * 行政區代碼
	 */
	private String areaCode;
	/**
	 * 是否預設地址
	 */
	private Integer defaultStatus;

}
