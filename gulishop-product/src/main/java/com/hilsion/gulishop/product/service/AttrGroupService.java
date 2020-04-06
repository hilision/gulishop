package com.hilsion.gulishop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hilsion.common.utils.PageUtils;
import com.hilsion.gulishop.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 17:31:34
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

