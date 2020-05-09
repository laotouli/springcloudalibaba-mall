package com.lxh.mall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.lxh.common.vaild.AddGroup;
import com.lxh.common.vaild.ListValue;
import com.lxh.common.vaild.UpdateGroup;
import com.lxh.common.vaild.UpdateStatusGroup;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * Ʒ?
 * 
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 13:33:49
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * Ʒ??id
	 */
	@NotNull(message = "修改必须指定Id",groups = {UpdateGroup.class})
	@Null(message = "新增不能指定Id",groups = {AddGroup.class})
	@TableId
	private Long brandId;
	/**
	 * Ʒ???
	 */
	@NotBlank(message = "品牌名不能为空",groups = {AddGroup.class,UpdateGroup.class})
	private String name;
	/**
	 * Ʒ??logo??ַ
	 */
	@NotEmpty(groups = {AddGroup.class})
	@URL(message = "logo必须为合法的URL地址",groups = {AddGroup.class,UpdateGroup.class})
	private String logo;
	/**
	 * ???
	 */
	private String descript;
	/**
	 * ??ʾ״̬[0-????ʾ??1-??ʾ]
	 *
	 */
	@NotNull(groups = {AddGroup.class, UpdateStatusGroup.class})
	@ListValue(vals={0,1},groups = {AddGroup.class, UpdateStatusGroup.class})
	private Integer showStatus;
	/**
	 * ????????ĸ
	 */
	@NotEmpty(groups = {AddGroup.class})
	@Pattern(regexp = "^[a-zA-Z]$",message = "检索必须是一个字母",groups = {AddGroup.class,UpdateGroup.class})
	private String firstLetter;
	/**
	 * ???
	 */
	@NotNull(groups = {AddGroup.class})
	@Min(value = 0,message = "排序必须大于等于0")
	private Integer sort;

}
