package com.sky.mapper;

import com.sky.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 根据分类 id 查询菜品数量
     * @param categoryId 分类 ID
     * @return 菜品数量
     */
    Integer countByCategoryId(Long categoryId);

    void insert(Dish dish);
}
