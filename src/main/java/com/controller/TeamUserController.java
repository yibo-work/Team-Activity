package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.TeamUser;
import com.service.TeamUserService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 团队成员Controller
 *
 * @author Clrvn
 */
@RestController
@RequestMapping("/teamUser")
public class TeamUserController {

    @Autowired
    private TeamUserService teamUserService;

    /**
     * 查询团队成员页面
     *
     * @return 分页团队成员数据
     */
    @GetMapping("/page")
    public PageInfo<TeamUser> page() {
        return teamUserService.page(new RequestParamsUtil());
    }

    /**
     * 查询团队成员列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<TeamUser> teamUserList = teamUserService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(teamUserList);
    }

    /**
     * 通过id查询单个团队成员
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        TeamUser teamUser = teamUserService.findById(id);
        return ResultVOUtil.success(teamUser);
    }

    /**
     * 通过map查询单个团队成员
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        TeamUser teamUser = teamUserService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(teamUser);
    }

    /**
     * 添加团队成员
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody TeamUser teamUser) {
        try {
            teamUserService.save(teamUser);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改团队成员
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody TeamUser teamUser) {
        try {
            teamUserService.update(teamUser);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除团队成员
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try {
            teamUserService.deleteById(id);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("删除失败！");
        }
    }

}