package com.xc.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xc.common.utils.PageUtils;
import com.xc.gulimall.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author xuchong
 * @email 416931874@qq.com
 * @date 2020-08-10 00:01:16
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

