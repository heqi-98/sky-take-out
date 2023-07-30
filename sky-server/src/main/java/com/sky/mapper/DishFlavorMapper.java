package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 按照dishId删除口味
     * @param id
     */
    @Delete("delete from dish_flavor where dish_id = #{id}")
    void deleteByDishId(Long id);

    /**
     * 按照dishId选择口味
     * @param id
     * @return
     */
    @Select("select * from dish_flavor where dish_id=#{id}")
    List<DishFlavor> getByDishId(Long id);

    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
