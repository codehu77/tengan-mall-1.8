package com.anulis.tenganmall.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 倉庫資訊
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 23:23:04
 */
@Data
@TableName("wms_ware_info")
public class WareInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 倉庫ID
	 */
	@TableId
	private Long id;
	/**
	 * 倉庫名稱
	 */
	private String name;
	/**
	 * 倉庫地址
	 */
	private String address;
	/**
	 * 區域代碼
	 */
	private String areaCode;

}
