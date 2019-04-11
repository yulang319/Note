package com.lirj.dyncproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DyncUserDaoHandler implements InvocationHandler {

    private IDyncUserDao userDao = null;

    public DyncUserDaoHandler(IDyncUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        try {
            System.out.println("动态代理：打开事务");
            System.out.println(method.getName());
            method.invoke(userDao, args);
            System.out.println("动态代理：关闭事务");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
