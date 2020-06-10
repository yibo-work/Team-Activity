package com.service;

import com.model.Team;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 团队Service
 * @author Clrvn
 */
public interface TeamService {

	/**
	 * 查询团队页面
	 * @return 分页团队数据
	 */
	PageInfo<Team> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询团队列表
	 */
	List<Team> list(Map<String, Object> map);

	/**
	 * 通过id查询单个团队
	 */
    Team findById(Integer id);

	/**
	 * 通过map查询单个团队
	 */
	Team findByMap(Map<String, Object> map);

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
