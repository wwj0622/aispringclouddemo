package com.southwind.service.impl;

import com.southwind.entity.TType;
import com.southwind.dao.TTypeDao;
import com.southwind.service.TTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TType)表服务实现类
 *
 * @author makejava
 * @since 2020-06-25 22:12:48
 */
@Service("tTypeService")
public class TTypeServiceImpl implements TTypeService {
    @Resource
    private TTypeDao tTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TType queryById(Integer id) {
        return this.tTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TType> queryAllByLimit(int offset, int limit) {
        return this.tTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tType 实例对象
     * @return 实例对象
     */
    @Override
    public TType insert(TType tType) {
        this.tTypeDao.insert(tType);
        return tType;
    }

    /**
     * 修改数据
     *
     * @param tType 实例对象
     * @return 实例对象
     */
    @Override
    public TType update(TType tType) {
        this.tTypeDao.update(tType);
        return this.queryById(tType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tTypeDao.deleteById(id) > 0;
    }
}