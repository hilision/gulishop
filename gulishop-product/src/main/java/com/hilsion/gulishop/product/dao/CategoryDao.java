package com.hilsion.gulishop.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hilsion.gulishop.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author hilsion
 * @email hilsion@gmail.com
 * @date 2020-04-06 17:31:34
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
