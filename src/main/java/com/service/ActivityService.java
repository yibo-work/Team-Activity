package com.service;

import com.github.pagehelper.PageInfo;
import com.model.Activity;
import com.utils.RequestParamsUtil;

import java.util.List;
import java.util.Map;

/**
 * 活动表Service
 *
 * @author Clrvn
 */
public interface ActivityService {

    /**
     * 查询活动表页面
     *
     * @return 分页活动表数据
     */
    PageInfo<Activity> page(RequestParamsUtil requestParamsUtil);

    /**
     * 查询活动表列表
     */
    List<Activity> list(Map<String, Object> map);

    /**
     * 通过id查询单个活动表
     */
    Activity findById(Integer id);

    /**
     * 通过map查询单个活动表
     */
    Activity findByMap(Map<String, Object> map);

    /**
     * 新增活动表
     */
    int save(Activity activity);

    /**
     * 修改活动表
     */
    int update(Activity activity);

    /**
     * 结束活动
     */
    int endActivity(Integer id);

    /**
     * 删除活动表
     */
    int deleteById(Integer id);

}
