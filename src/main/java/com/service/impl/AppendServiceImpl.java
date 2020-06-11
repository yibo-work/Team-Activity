package com.service.impl;

import com.dao.AppendDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Append;
import com.service.AppendService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 活动追加费用ServiceImpl
 *
 * @author Clrvn
 */
@Service
public class AppendServiceImpl implements AppendService {

    @Autowired
    private AppendDao appendDao;

    /**
     * 查询活动追加费用页面
     *
     * @return 分页活动追加费用数据
     */
    @Override
    public PageInfo<Append> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(appendDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询活动追加费用列表
     */
    @Override
    public List<Append> list(Map<String, Object> map) {
        return appendDao.list(map);
    }


    /**
     * 通过id查询单个活动追加费用
     */
    @Override
    public Append findById(Integer id) {
        return appendDao.findById(id);
    }

    /**
     * 通过map查询单个活动追加费用
     */
    @Override
    public Append findByMap(Map<String, Object> map) {
        return appendDao.findByMap(map);
    }

    /**
     * 新增活动追加费用
     */
    @Override
    public int save(Append append) {
        return appendDao.save(append);
    }

    /**
     * 修改活动追加费用
     */
    @Override
    public int update(Append append) {
        return appendDao.update(append);
    }

    /**
     * 删除活动追加费用
     */
    @Override
    public int deleteById(Integer id) {
        return appendDao.deleteById(id);
    }

}
