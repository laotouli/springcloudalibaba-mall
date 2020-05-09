package com.lxh.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * ??ҳר??????jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:01:07
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

