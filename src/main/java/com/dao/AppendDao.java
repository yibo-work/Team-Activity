package com.dao;

import com.model.Append;

import java.util.List;
import java.util.Map;


/**
 * 活动追加费用DAO
 *
 * @author Clrvn
 */
public interface AppendDao {

    /**
     * 通过id查询单个活动追加费用
     */
    Append findById(Integer id);

    /**
     * 通过map查询单个活动追加费用
     */
    Append findByMap(Map<String, Object> map);

    /**
     * 查询活动追加费用列表
     */
    List<Append> list(Map<String, Object> map);

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
