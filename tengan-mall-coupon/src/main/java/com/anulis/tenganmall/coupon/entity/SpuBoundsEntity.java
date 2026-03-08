package com.anulis.tenganmall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * SPU 點數設定
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:21:41
 */
@Data
@TableName("sms_spu_bounds")
public class SpuBoundsEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * 成長點數
	 */
	private BigDecimal growBounds;
	/**
	 * 購物點數
	 */
	private BigDecimal buyBounds;
	/**
	 * 優惠生效狀態（位元旗標）
	 */
	private Integer effectFlag;

}
