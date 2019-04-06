package com.lirj.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloServer {

    @WebMethod
    public String hello(String msg) {
        return "Hello, " + msg;
    }

}
