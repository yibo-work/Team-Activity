package com.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.model.ActivityUser;
import com.service.ActivityUserService;
import com.dao.ActivityUserDao;
import com.utils.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 活动成员ServiceImpl
 * @author Clrvn
 */
@Service
public class ActivityUserServiceImpl implements ActivityUserService {

    @Autowired
    private ActivityUserDao activityUserDao;

    /**
     * 查询活动成员页面
     * @return 分页活动成员数据
     */
    @Override
    public PageInfo<ActivityUser> page(RequestParamsUtil requestParamsUtil) {
        PageHelper.startPage(requestParamsUtil.getPageNo(), requestParamsUtil.getPageSize());
        return new PageInfo<>(activityUserDao.list(requestParamsUtil.getParameters()));
    }

    /**
     * 查询活动成员列表
     */
    @Override
    public List<ActivityUser> list(Map<String, Object> map) {
        return activityUserDao.list(map);
    }


    /**
     * 通过id查询单个活动成员
     */
    @Override
    public ActivityUser findById(Integer id) {
        return activityUserDao.findById(id);
    }

    /**
     * 通过map查询单个活动成员
     */
    @Override
    public ActivityUser findByMap(Map<String, Object> map) {
        return activityUserDao.findByMap(map);
    }

    /**
     * 新增活动成员
     */
    @Override
    public int save(ActivityUser activityUser) {
        return activityUserDao.save(activityUser);
    }

    /**
     * 修改活动成员
     */
    @Override
    public int update(ActivityUser activityUser) {
        return activityUserDao.update(activityUser);
    }

    /**
     * 删除活动成员
     */
    @Override
    public int deleteById(Integer id) {
        return activityUserDao.deleteById(id);
    }

}
