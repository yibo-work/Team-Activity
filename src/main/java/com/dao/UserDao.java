package com.dao;

import com.model.User;

import java.util.List;
import java.util.Map;


/**
 * 会员DAO
 *
 * @author Clrvn
 */
public interface UserDao {

    /**
     * 通过id查询单个会员
     */
    User findById(Integer id);

    /**
     * 通过map查询单个会员
     */
    User findByMap(Map<String, Object> map);

    /**
     * 查询会员列表
     */
    List<User> list(Map<String, Object> map);

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

}
