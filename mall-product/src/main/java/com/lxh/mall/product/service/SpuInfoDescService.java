package com.lxh.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu??Ϣ???
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 13:33:49
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);

}

