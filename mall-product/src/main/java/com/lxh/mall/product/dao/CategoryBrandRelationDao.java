package com.lxh.mall.product.dao;

import com.lxh.mall.product.entity.CategoryBrandRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Ʒ?Ʒ???????
 * 
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 13:33:48
 */
@Mapper
public interface CategoryBrandRelationDao extends BaseMapper<CategoryBrandRelationEntity> {

    void updateCategory(@Param("catId") Long catId, @Param("name") String name);
}
