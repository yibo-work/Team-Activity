package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Clrvn
 */
@Controller
public class PageController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("loginOut")
    public String loginOut(HttpSession session) {
        session.removeAttribute("USER");
        session.invalidate();
        session.getServletContext().removeAttribute(session.getId());
        return "login";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }

    /**
     * 修改个人信息
     */
    @GetMapping("/editMine")
    public String editMine() {
        return "editMine";
    }

    /**
     * 注册
     */
    @GetMapping("/register")
    public String register() {
        return "register";
    }

    /**
     * 会员管理
     */
    @GetMapping("/userManage")
    public String userManage() {
        return "userManage";
    }

    @GetMapping("/userAdd")
    public String userAdd() {
        return "userAdd";
    }

    @GetMapping("/userEdit")
    public String userEdit() {
        return "userEdit";
    }

    /**
     * 团队管理
     */
    @GetMapping("/myTeamManage")
    public String myTeamManage() {
        return "myTeamManage";
    }

    @GetMapping("/teamManage")
    public String teamManage() {
        return "teamManage";
    }

    @GetMapping("/addTeamFee")
    public String addTeamFee() {
        return "addTeamFee";
    }

    @GetMapping("/teamAdd")
    public String teamAdd() {
        return "teamAdd";
    }

    @GetMapping("/teamEdit")
    public String teamEdit() {
        return "teamEdit";
    }

    @GetMapping("/teamUserManage")
    public String teamUserManage() {
        return "teamUserManage";
    }

    @GetMapping("/teamUserAdd")
    public String teamUserAdd() {
        return "teamUserAdd";
    }


    /**
     * 活动管理
     */
    @GetMapping("/activityManage")
    public String activityManage() {
        return "activityManage";
    }

    @GetMapping("/activityAdd")
    public String activityAdd() {
        return "activityAdd";
    }

    @GetMapping("/activityEdit")
    public String activityEdit() {
        return "activityEdit";
    }

    @GetMapping("/activityUserManage")
    public String activityUserManage() {
        return "activityUserManage";
    }

    @GetMapping("/activityUserAdd")
    public String activityUserAdd() {
        return "activityUserAdd";
    }

    @GetMapping("/activityUserEdit")
    public String activityUserEdit() {
        return "activityUserEdit";
    }

}
