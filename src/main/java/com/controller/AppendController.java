package com.controller;

import com.github.pagehelper.PageInfo;
import com.model.Append;
import com.service.AppendService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 活动追加费用Controller
 * @author Clrvn
 */
@RestController
@RequestMapping("/append")
public class AppendController {

    @Autowired
    private AppendService appendService;

    /**
     * 查询活动追加费用页面
     * @return 分页活动追加费用数据
     */
    @GetMapping("/page")
    public PageInfo<Append> page() {
        return appendService.page(new RequestParamsUtil());
    }

    /**
     * 查询活动追加费用列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<Append> appendList = appendService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(appendList);
    }

    /**
     * 通过id查询单个活动追加费用
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        Append append =appendService.findById(id);
        return ResultVOUtil.success(append);
    }

    /**
     * 通过map查询单个活动追加费用
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        Append append =appendService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(append);
    }

    /**
     * 添加活动追加费用
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody Append append) {
        try{
            appendService.save(append);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改活动追加费用
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody Append append) {
        try{
            appendService.update(append);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除活动追加费用
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try{
            appendService.deleteById(id);
            return ResultVOUtil.success();
        }catch (Exception ex){
            return ResultVOUtil.failure("删除失败！");
        }
    }

}