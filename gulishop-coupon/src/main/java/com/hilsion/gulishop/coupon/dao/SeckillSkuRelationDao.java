package com.hilsion.gulishop.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.coupon.entity.SeckillSkuRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 18:36:20
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelationEntity> {

}
