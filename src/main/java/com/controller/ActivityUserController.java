package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.ActivityUser;
import com.service.ActivityUserService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 活动成员Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/activityUser")
public class ActivityUserController {

    @Autowired
    private ActivityUserService activityUserService;

    /**
     * 查询活动成员页面
     * @return 分页活动成员数据
     */
    @GetMapping("/page")
    public PageInfo<ActivityUser> page() {
        return activityUserService.page(new RequestParamsUtil());
    }

    /**
     * 查询活动成员列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<ActivityUser> activityUserList = activityUserService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(activityUserList);
    }

    /**
     * 通过id查询单个活动成员
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        ActivityUser activityUser =activityUserService.findById(id);
        return ResultVOUtil.success(activityUser);
    }

    /**
     * 通过map查询单个活动成员
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        ActivityUser activityUser =activityUserService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(activityUser);
    }

    /**
     * 添加活动成员
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody ActivityUser activityUser) {
        try{
            activityUserService.save(activityUser);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改活动成员
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody ActivityUser activityUser) {
        try{
            activityUserService.update(activityUser);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除活动成员
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try{
            activityUserService.deleteById(id);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("删除失败！");
        }
    }

}