package com.service.impl;

import com.dao.TeamDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.Team;
import com.service.TeamService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 团队ServiceImpl
 *
 * @author Clrvn
 */
@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamDao teamDao;

    /**
     * 查询团队页面
     *
     * @return 分页团队数据
     */
    @Override
    public PageInfo<Team> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(teamDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询团队列表
     */
    @Override
    public List<Team> list(Map<String, Object> map) {
        return teamDao.list(map);
    }


    /**
     * 通过id查询单个团队
     */
    @Override
    public Team findById(Integer id) {
        return teamDao.findById(id);
    }

    /**
     * 通过map查询单个团队
     */
    @Override
    public Team findByMap(Map<String, Object> map) {
        return teamDao.findByMap(map);
    }

    /**
     * 新增团队
     */
    @Override
    public int save(Team team) {
        return teamDao.save(team);
    }

    /**
     * 修改团队
     */
    @Override
    public int update(Team team) {
        return teamDao.update(team);
    }

    /**
     * 删除团队
     */
    @Override
    public int deleteById(Integer id) {
        return teamDao.deleteById(id);
    }

}
