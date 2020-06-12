package com.service.impl;

import com.dao.UserDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.User;
import com.service.UserService;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 会员ServiceImpl
 *
 * @author Clrvn
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 查询会员页面
     *
     * @return 分页会员数据
     */
    @Override
    public PageInfo<User> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(userDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询会员列表
     */
    @Override
    public List<User> list(Map<String, Object> map) {
        return userDao.list(map);
    }


    /**
     * 通过id查询单个会员
     */
    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    /**
     * 通过map查询单个会员
     */
    @Override
    public User findByMap(Map<String, Object> map) {
        return userDao.findByMap(map);
    }

    /**
     * 新增会员
     */
    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    /**
     * 修改会员
     */
    @Override
    public int update(User user) {
        return userDao.update(user);
    }

    /**
     * 删除会员
     */
    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    /**
     * 查询未在团队会员列表
     */
    @Override
    public List<User> getAddTeamUserList(Map<String, Object> parameters) {
        return userDao.getAddTeamUserList(parameters);
    }

    /**
     * 查询未在活动会员列表
     */
    @Override
    public List<User> getAddActivityUserList(Map<String, Object> parameters) {
        return userDao.getAddActivityUserList(parameters);
    }

    /**
     * 获取活动的会员列表
     */
    @Override
    public List<User> getAddActivityFeeList(Map<String, Object> parameters) {
        return userDao.getAddActivityFeeList(parameters);
    }

    /**
     * 查询团队会员列表
     */
    @Override
    @Deprecated
    public PageInfo<User> getTeamUserList(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(userDao.getTeamUserList(requestParamsUtil.getParameters()));
    }

}
