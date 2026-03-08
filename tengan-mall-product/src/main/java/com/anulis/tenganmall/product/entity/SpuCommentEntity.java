package com.anulis.tenganmall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 商品評論
 * 
 * @author hu77
 * @email codehu77@gmail.com
 * @date 2026-03-08 18:51:57
 */
@Data
@TableName("pms_spu_comment")
public class SpuCommentEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主鍵ID
	 */
	@TableId
	private Long id;
	/**
	 * SKU ID
	 */
	private Long skuId;
	/**
	 * SPU ID
	 */
	private Long spuId;
	/**
	 * 商品名稱
	 */
	private String spuName;
	/**
	 * 會員暱稱
	 */
	private String memberNickName;
	/**
	 * 星等
	 */
	private Integer star;
	/**
	 * 會員IP
	 */
	private String memberIp;
	/**
	 * 建立時間
	 */
	private Date createTime;
	/**
	 * 顯示狀態【0->不顯示；1->顯示】
	 */
	private Integer showStatus;
	/**
	 * 購買時的屬性組合
	 */
	private String spuAttributes;
	/**
	 * 按讚數
	 */
	private Integer likesCount;
	/**
	 * 回覆數
	 */
	private Integer replyCount;
	/**
	 * 評論圖片/影片（JSON；[{type:檔案類型,url:資源路徑}]）
	 */
	private String resources;
	/**
	 * 內容
	 */
	private String content;
	/**
	 * 使用者頭像
	 */
	private String memberIcon;
	/**
	 * 評論類型【0->直接評論商品；1->回覆評論】
	 */
	private Integer commentType;

}
