package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Team;
import com.service.TeamService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 团队Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    /**
     * 查询团队页面
     * @return 分页团队数据
     */
    @GetMapping("/page")
    public PageInfo<Team> page() {
        return teamService.page(new RequestParamsUtil());
    }

    /**
     * 查询团队列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Team> teamList = teamService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(teamList);
    }

    /**
     * 通过id查询单个团队
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Team team =teamService.findById(id);
        return ResultVOUtil.success(team);
    }

    /**
     * 通过map查询单个团队
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Team team =teamService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(team);
    }

    /**
     * 添加团队
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Team team) {
        try{
            teamService.save(team);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改团队
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Team team) {
        try{
            teamService.update(team);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除团队
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try{
            teamService.deleteById(id);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("删除失败！");
        }
    }

}