package com.service;

import com.model.TeamUser;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 团队成员Service
 * @author Clrvn
 */
public interface TeamUserService {

	/**
	 * 查询团队成员页面
	 * @return 分页团队成员数据
	 */
	PageInfo<TeamUser> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询团队成员列表
	 */
	List<TeamUser> list(Map<String, Object> map);

	/**
	 * 通过id查询单个团队成员
	 */
    TeamUser findById(Integer id);

	/**
	 * 通过map查询单个团队成员
	 */
	TeamUser findByMap(Map<String, Object> map);

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
