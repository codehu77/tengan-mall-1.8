package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員資料
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_member")
public class MemberEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 會員ID
	 */
	@TableId
	private Long id;
	/**
	 * 會員等級ID
	 */
	private Long levelId;
	/**
	 * 帳號
	 */
	private String username;
	/**
	 * 密碼
	 */
	private String password;
	/**
	 * 暱稱
	 */
	private String nickname;
	/**
	 * 手機號碼
	 */
	private String mobile;
	/**
	 * Email
	 */
	private String email;
	/**
	 * 頭像
	 */
	private String header;
	/**
	 * 性別
	 */
	private Integer gender;
	/**
	 * 生日
	 */
	private Date birth;
	/**
	 * 所在城市
	 */
	private String city;
	/**
	 * 職業
	 */
	private String job;
	/**
	 * 個人簽名
	 */
	private String sign;
	/**
	 * 會員來源
	 */
	private Integer sourceType;
	/**
	 * 會員點數
	 */
	private Integer integration;
	/**
	 * 會員成長值
	 */
	private Integer growth;
	/**
	 * 帳號狀態
	 */
	private Integer status;
	/**
	 * 註冊時間
	 */
	private Date createTime;

}
