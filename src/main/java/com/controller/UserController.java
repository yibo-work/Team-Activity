package com.controller;

import com.enums.ResultFailureEnum;
import com.github.pagehelper.PageInfo;
import com.model.User;
import com.service.UserService;
import com.utils.RequestParamsUtil;
import com.utils.ResultVOUtil;
import com.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 会员Controller
 *
 * @author Clrvn
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public ResultVO login(@RequestBody User loginUser, HttpSession session) {

        Map<String, Object> map = new HashMap<>();
        map.put("name", loginUser.getName());
        map.put("password", loginUser.getPassword());
        User user = userService.findByMap(map);
        if (user != null) {
            session.setAttribute("USER", user);
            return ResultVOUtil.success();
        } else {
            return ResultVOUtil.failure(ResultFailureEnum.LOGIN_ERROR);
        }

    }

    @RequestMapping("/loginOut")
    public void loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
    }

    @RequestMapping("/register")
    public ResultVO register(@RequestBody User user, HttpSession session) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", user.getName());
        User findUser = userService.findByMap(map);
        if (findUser != null) {
            return ResultVOUtil.failure(ResultFailureEnum.REGISTER_ERROR);
        } else {
            userService.save(user);
            session.setAttribute("USER", user);
            return ResultVOUtil.success();
        }

    }

    /**
     * 查询会员页面
     *
     * @return 分页会员数据
     */
    @GetMapping("/page")
    public PageInfo<User> page() {
        return userService.page(new RequestParamsUtil());
    }

    /**
     * 查询会员列表
     */
    @GetMapping("/list")
    public ResultVO list() {
        List<User> userList = userService.list(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 查询团队会员页面
     *
     * @return 分页会员数据
     */
    @GetMapping("/teamUserPage")
    @Deprecated
    public PageInfo<User> teamUserPage() {
        return userService.getTeamUserList(new RequestParamsUtil());
    }

    /**
     * 查询未在团队会员列表
     */
    @GetMapping("/getAddTeamUserList")
    public ResultVO getAddTeamUserList() {
        List<User> userList = userService.getAddTeamUserList(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 查询未在活动会员列表
     */
    @GetMapping("/getAddTeamUserList")
    public ResultVO getAddActivityUserList() {
        List<User> userList = userService.getAddActivityUserList(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 查询活动会员列表
     */
    @GetMapping("/getAddActivityFeeList")
    public ResultVO getAddActivityFeeList() {
        List<User> userList = userService.getAddActivityFeeList(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(userList);
    }

    /**
     * 通过id查询单个会员
     */
    @GetMapping("/findById")
    public ResultVO findById(@RequestParam(value = "id") Integer id) {
        User user = userService.findById(id);
        return ResultVOUtil.success(user);
    }

    /**
     * 通过map查询单个会员
     */
    @GetMapping("/findByMap")
    public ResultVO findByMap() {
        User user = userService.findByMap(new RequestParamsUtil().getParameters());
        return ResultVOUtil.success(user);
    }

    /**
     * 添加会员
     */
    @PostMapping("/save")
    public ResultVO save(@RequestBody User user) {
        try {
            userService.save(user);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("添加失败！");
        }
    }

    /**
     * 修改会员
     */
    @PutMapping("/update")
    public ResultVO update(@RequestBody User user) {
        try {
            userService.update(user);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("修改失败！");
        }

    }

    /**
     * 删除会员
     */
    @DeleteMapping("/deleteById")
    public ResultVO deleteById(@RequestParam(value = "id") Integer id) {
        try {
            userService.deleteById(id);
            return ResultVOUtil.success();
        } catch (Exception ex) {
            return ResultVOUtil.failure("删除失败！");
        }
    }

}