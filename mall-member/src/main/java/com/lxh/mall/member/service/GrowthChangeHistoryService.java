package com.lxh.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * ?ɳ?ֵ?仯??ʷ??¼
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:16:44
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

