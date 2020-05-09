package com.lxh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * ?Ż?ȯ??Ϣ
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:01:07
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

