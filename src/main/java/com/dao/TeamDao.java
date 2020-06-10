package com.dao;

import com.model.Team;

import java.util.List;
import java.util.Map;


/**
 * 团队DAO
 * @author Clrvn
 */
public interface TeamDao {

    /**
     * 通过id查询单个团队
     */
    Team findById(Integer id);

    /**
     * 通过map查询单个团队
     */
    Team findByMap(Map<String, Object> map);

    /**
     * 查询团队列表
     */
    List<Team> list(Map<String, Object> map);

    /**
     * 新增团队
     */
    int save(Team team);

    /**
     * 修改团队
     */
    int update(Team team);

    /**
     * 删除团队
     */
    int deleteById(Integer id);

}
