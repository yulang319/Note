package com.yl.spring.controller;

import com.yl.spring.bean.User;
import com.yl.spring.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUser() {
        List<User> users  = userService.getUsers();
        StringBuilder ret = new StringBuilder();
        if (null != users && !users.isEmpty()) {
            for (User user : users) {
                ret.append(user.toString());
                ret.append("\n");
            }
        } else {
            ret.append("没有查询到任何记录");
        }
        return ret.toString();
    }

}
