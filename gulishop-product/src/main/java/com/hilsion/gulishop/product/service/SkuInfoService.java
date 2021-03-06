package com.hilsion.gulishop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 17:31:34
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

