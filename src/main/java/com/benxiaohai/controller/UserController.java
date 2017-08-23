package com.benxiaohai.controller;


import com.benxiaohai.domain.User;
import com.benxiaohai.domain.Website;
import com.benxiaohai.service.UserService;

import com.benxiaohai.service.WebsiteService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * Controller与RestController不同，如果使用RestController
 * 输入http://localhost:8080/index，页面显示index
 * 使用Controller，页面后跳转到index.html
 * Created by lenovo on 2017/8/17.
 */
@Controller
public class UserController {
    @Resource
    UserService userService;
    @Resource
    WebsiteService websiteService;
    @RequestMapping(value = "/loginIn")
    public String loginIn(User user, Model model, HttpSession httpSession){
        String result = userService.findUser(user);
        if(result.equals("success")){
            List<Website> websites = websiteService.findAllwebsite();
            httpSession.setAttribute("user",user);
            model.addAttribute("websites",websites);
            return  "sitelist";
        }
        return "login";
    }
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpSession session) {
        //从session中删除user属性，用户退出登录
        session.removeAttribute("user");
        return "index";
    }
    @RequestMapping("/index")
    public String index() {
        //重定向到 /index
        return "index";
    }

    @RequestMapping("/login")
    public String loginGet() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerGet() {
        return "register";
    }
}
