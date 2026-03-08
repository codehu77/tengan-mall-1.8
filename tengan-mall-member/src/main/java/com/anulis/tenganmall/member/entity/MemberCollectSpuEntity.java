package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員收藏商品
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_member_collect_spu")
public class MemberCollectSpuEntity implements Serializable {
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
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * 商品名稱
	 */
	private String spuName;
	/**
	 * 商品圖片
	 */
	private String spuImg;
	/**
	 * 收藏時間
	 */
	private Date createTime;

}
