package com.yl.spring.controller;

import com.yl.spring.bean.User;
import com.yl.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UserHtmlController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/usershtml", method = RequestMethod.GET)
    public String getUser(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        return "user";
    }

}
