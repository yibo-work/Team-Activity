package com.service;

import com.model.ActivityUser;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 活动成员Service
 * @author Clrvn
 */
public interface ActivityUserService {

	/**
	 * 查询活动成员页面
	 * @return 分页活动成员数据
	 */
	PageInfo<ActivityUser> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询活动成员列表
	 */
	List<ActivityUser> list(Map<String, Object> map);

	/**
	 * 通过id查询单个活动成员
	 */
    ActivityUser findById(Integer id);

	/**
	 * 通过map查询单个活动成员
	 */
	ActivityUser findByMap(Map<String, Object> map);

	/**
	 * 新增活动成员
	 */
	int save(ActivityUser activityUser);

	/**
	 * 修改活动成员
	 */
	int update(ActivityUser activityUser);

	/**
	 * 删除活动成员
	 */
	int deleteById(Integer id);

}
