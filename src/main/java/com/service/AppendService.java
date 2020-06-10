package com.service;

import com.model.Append;
import com.github.pagehelper.PageInfo;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 活动追加费用Service
 * @author Clrvn
 */
public interface AppendService {

	/**
	 * 查询活动追加费用页面
	 * @return 分页活动追加费用数据
	 */
	PageInfo<Append> page(RequestParamsUtil requestParamsUtil);

	/**
	 * 查询活动追加费用列表
	 */
	List<Append> list(Map<String, Object> map);

	/**
	 * 通过id查询单个活动追加费用
	 */
    Append findById(Integer id);

	/**
	 * 通过map查询单个活动追加费用
	 */
	Append findByMap(Map<String, Object> map);

	/**
	 * 新增活动追加费用
	 */
	int save(Append append);

	/**
	 * 修改活动追加费用
	 */
	int update(Append append);

	/**
	 * 删除活动追加费用
	 */
	int deleteById(Integer id);

}
