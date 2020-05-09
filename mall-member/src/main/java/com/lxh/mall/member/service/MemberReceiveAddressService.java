package com.lxh.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * ??Ա?ջ???ַ
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:16:44
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

