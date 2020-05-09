package com.lxh.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lxh.common.utils.PageUtils;
import com.lxh.mall.ware.entity.PurchaseEntity;
import com.lxh.mall.ware.vo.MergeVo;
import com.lxh.mall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

/**
 * ?ɹ???Ϣ
 *
 * @author lixiuhu
 * @email lixiuhu1998@gmail.com
 * @date 2020-04-25 15:37:17
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

    void mergePurchase(MergeVo mergeVo);

    void received(List<Long> ids);

    void done(PurchaseDoneVo purchaseDoneVo);

}

