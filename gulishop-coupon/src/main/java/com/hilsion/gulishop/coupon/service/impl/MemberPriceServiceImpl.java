package com.hilsion.gulishop.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.common.utils.Query;
import com.hilsion.gulishop.coupon.dao.MemberPriceDao;
import com.hilsion.gulishop.coupon.entity.MemberPriceEntity;
import com.hilsion.gulishop.coupon.service.MemberPriceService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}