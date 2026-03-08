package com.anulis.tenganmall.member.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 會員等級
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:19:54
 */
@Data
@TableName("ums_member_level")
public class MemberLevelEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * 等級名稱
	 */
	private String name;
	/**
	 * 升級所需成長值
	 */
	private Integer growthPoint;
	/**
	 * 是否為預設等級【0->否；1->是】
	 */
	private Integer defaultStatus;
	/**
	 * 免運門檻
	 */
	private BigDecimal freeFreightPoint;
	/**
	 * 評論獲得成長值
	 */
	private Integer commentGrowthPoint;
	/**
	 * 是否有免運權益
	 */
	private Integer privilegeFreeFreight;
	/**
	 * 是否有會員價權益
	 */
	private Integer privilegeMemberPrice;
	/**
	 * 是否有生日特權
	 */
	private Integer privilegeBirthday;
	/**
	 * 備註
	 */
	private String note;

}
