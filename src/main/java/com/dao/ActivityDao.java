package com.dao;

import com.model.Activity;

import java.util.List;
import java.util.Map;


/**
 * 活动表DAO
 * @author Clrvn
 */
public interface ActivityDao {

    /**
     * 通过id查询单个活动表
     */
    Activity findById(Integer id);

    /**
     * 通过map查询单个活动表
     */
    Activity findByMap(Map<String, Object> map);

    /**
     * 查询活动表列表
     */
    List<Activity> list(Map<String, Object> map);

    /**
     * 新增活动表
     */
    int save(Activity activity);

    /**
     * 修改活动表
     */
    int update(Activity activity);

    /**
     * 删除活动表
     */
    int deleteById(Integer id);

}
