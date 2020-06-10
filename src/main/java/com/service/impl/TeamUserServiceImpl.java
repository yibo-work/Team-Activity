package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.TeamUser;
import com.service.TeamUserService;
import com.dao.TeamUserDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 团队成员ServiceImpl
 * @author Clrvn
 */
@Service
public class TeamUserServiceImpl implements TeamUserService {

    @Autowired
    private TeamUserDao teamUserDao;

    /**
     * 查询团队成员页面
     * @return 分页团队成员数据
     */
    @Override
    public PageInfo<TeamUser> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(teamUserDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询团队成员列表
     */
    @Override
    public List<TeamUser> list(Map<String, Object> map) {
        return teamUserDao.list(map);
    }


    /**
     * 通过id查询单个团队成员
     */
    @Override
    public TeamUser findById(Integer id) {
        return teamUserDao.findById(id);
    }

    /**
     * 通过map查询单个团队成员
     */
    @Override
    public TeamUser findByMap(Map<String, Object> map) {
        return teamUserDao.findByMap(map);
    }

    /**
     * 新增团队成员
     */
    @Override
    public int save(TeamUser teamUser) {
        return teamUserDao.save(teamUser);
    }

    /**
     * 修改团队成员
     */
    @Override
    public int update(TeamUser teamUser) {
        return teamUserDao.update(teamUser);
    }

    /**
     * 删除团队成员
     */
    @Override
    public int deleteById(Integer id) {
        return teamUserDao.deleteById(id);
    }

}
