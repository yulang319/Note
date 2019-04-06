package com.lirj.server;

import com.lirj.bean.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloObjectServer {

    @WebMethod
    public String helloObject(User user) {
        return user.toString();
    }

}
