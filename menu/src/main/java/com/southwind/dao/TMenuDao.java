package com.southwind.dao;

import com.southwind.entity.TMenu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TMenu)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-25 16:51:13
 */
public interface TMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TMenu queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TMenu> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tMenu 实例对象
     * @return 对象列表
     */
    List<TMenu> queryAll(TMenu tMenu);

    /**
     * 新增数据
     *
     * @param tMenu 实例对象
     * @return 影响行数
     */
    int insert(TMenu tMenu);

    /**
     * 修改数据
     *
     * @param tMenu 实例对象
     * @return 影响行数
     */
    int update(TMenu tMenu);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}