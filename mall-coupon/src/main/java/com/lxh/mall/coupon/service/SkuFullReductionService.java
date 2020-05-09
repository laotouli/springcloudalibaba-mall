package com.lxh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.to.SkuReductionTo;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * ??Ʒ??????Ϣ
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:01:08
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuReduction(SkuReductionTo skuReductionTo);

}

