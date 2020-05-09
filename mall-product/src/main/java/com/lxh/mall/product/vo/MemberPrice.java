/**
  * Copyright 2019 bejson.com 
  */
package com.lxh.mall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}