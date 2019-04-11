package com.lirj;

import com.lirj.dyncproxy.DyncUserDao;
import com.lirj.dyncproxy.DyncUserDaoHandler;
import com.lirj.dyncproxy.IDyncUserDao;
import com.lirj.proxy.UserDaoImpl;
import com.lirj.proxy.UserDaoProxy;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class TestClass {

    /**
     * 测试静态代理
     */
    @Test
    public void testProxy() {
        System.out.println("测试静态代理开始");

        UserDaoImpl userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();

        System.out.println("测试静态代理结束");
    }

    @Test
    public void testDyncProxy() {
        System.out.println("测试动态代理开始");

        DyncUserDao userDao = new DyncUserDao();
        DyncUserDaoHandler userDaoHandler = new DyncUserDaoHandler(userDao);
        IDyncUserDao dao = (IDyncUserDao) Proxy.newProxyInstance(userDaoHandler.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                userDaoHandler);

        dao.save();

        System.out.println("测试动态代理结束");
    }
}
