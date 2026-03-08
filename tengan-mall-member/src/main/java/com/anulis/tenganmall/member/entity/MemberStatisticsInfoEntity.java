package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員統計資料
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_member_statistics_info")
public class MemberStatisticsInfoEntity implements Serializable {
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
	 * 累計消費金額
	 */
	private BigDecimal consumeAmount;
	/**
	 * 累計優惠金額
	 */
	private BigDecimal couponAmount;
	/**
	 * 訂單數量
	 */
	private Integer orderCount;
	/**
	 * 優惠券數量
	 */
	private Integer couponCount;
	/**
	 * 評論數
	 */
	private Integer commentCount;
	/**
	 * 退貨數量
	 */
	private Integer returnOrderCount;
	/**
	 * 登入次數
	 */
	private Integer loginCount;
	/**
	 * 關注數量
	 */
	private Integer attendCount;
	/**
	 * 粉絲數量
	 */
	private Integer fansCount;
	/**
	 * 收藏商品數
	 */
	private Integer collectProductCount;
	/**
	 * 收藏活動數
	 */
	private Integer collectSubjectCount;
	/**
	 * 收藏評論數
	 */
	private Integer collectCommentCount;
	/**
	 * 邀請好友數
	 */
	private Integer inviteFriendCount;

}
