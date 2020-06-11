package com.dao;

import com.model.TeamUser;

import java.util.List;
import java.util.Map;


/**
 * 团队成员DAO
 *
 * @author Clrvn
 */
public interface TeamUserDao {

    /**
     * 通过id查询单个团队成员
     */
    TeamUser findById(Integer id);

    /**
     * 通过map查询单个团队成员
     */
    TeamUser findByMap(Map<String, Object> map);

    /**
     * 查询团队成员列表
     */
    List<TeamUser> list(Map<String, Object> map);

    /**
     * 新增团队成员
     */
    int save(TeamUser teamUser);

    /**
     * 修改团队成员
     */
    int update(TeamUser teamUser);

    /**
     * 删除团队成员
     */
    int deleteById(Integer id);

}
