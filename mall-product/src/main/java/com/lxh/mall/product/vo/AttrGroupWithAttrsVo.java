package com.lxh.mall.product.vo;

import com.lxh.mall.product.entity.AttrEntity;
import lombok.Data;

import java.util.List;

@Data
public class AttrGroupWithAttrsVo {
    /**
     * ????id
     */
    private Long attrGroupId;
    /**
     * ???
     */
    private String attrGroupName;
    /**
     * ???
     */
    private Integer sort;
    /**
     * ???
     */
    private String descript;
    /**
     * ??ͼ?
     */
    private String icon;
    /**
     * ????????id
     */
    private Long catelogId;

    private List<AttrEntity> attrs;
}
