package com.yl.spring.controller;

import com.yl.spring.bean.User;
import com.yl.spring.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUser() {
        List<User> users  = userService.getUsers();
        return users.toString();
    }

}
