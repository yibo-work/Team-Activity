package com.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.model.User;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 会员Service
 *
 * @author Clrvn
 */
public interface UserService {

    /**
     * 查询会员页面
     *
     * @return 分页会员数据
     */
    PageInfo<User> page(RequestParamsUtil requestParamsUtil);

    /**
     * 查询会员列表
     */
    List<User> list(Map<String, Object> map);

    /**
     * 通过id查询单个会员
     */
    User findById(Integer id);

    /**
     * 通过map查询单个会员
     */
    User findByMap(Map<String, Object> map);

    /**
     * 新增会员
     */
    int save(User user);

    /**
     * 修改会员
     */
    int update(User user);

    /**
     * 删除会员
     */
    int deleteById(Integer id);

    /**
     * 查询未在团队会员列表
     */
    List<User> getAddTeamUserList(Map<String, Object> parameters);

    /**
     * 查询在团队会员列表
     */
    @Deprecated
    PageInfo<User> getTeamUserList(RequestParamsUtil requestParamsUtil)  ;
}
