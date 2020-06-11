package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Activity;
import com.service.ActivityService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 活动表Controller
 *
 * @author Clrvn
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    /**
     * 查询活动表页面
     *
     * @return 分页活动表数据
     */
    @GetMapping("/page")
    public PageInfo<Activity> page() {
        return activityService.page(new RequestParamsUtil());
    }

    /**
     * 查询活动表列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Activity> activityList = activityService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(activityList);
    }

    /**
     * 通过id查询单个活动表
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Activity activity = activityService.findById(id);
        return ResultVOUtil.success(activity);
    }

    /**
     * 通过map查询单个活动表
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Activity activity = activityService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(activity);
    }

    /**
     * 添加活动表
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Activity activity) {
        try {
            activityService.save(activity);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改活动表
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Activity activity) {
        try {
            activityService.update(activity);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除活动表
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try {
            activityService.deleteById(id);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("删除失败！");
        }
    }

}