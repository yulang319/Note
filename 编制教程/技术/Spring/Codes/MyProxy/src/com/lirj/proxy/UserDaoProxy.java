package com.lirj.proxy;

public class UserDaoProxy implements IUserDao {

    private IUserDao userDao;

    public UserDaoProxy(IUserDao userDao) {
        if (userDao instanceof UserDaoImpl) {
            this.userDao = userDao;
        }
    }

    @Override
    public void save() {
        System.out.println("打开事务...");
        userDao.save();
        System.out.println("关闭事务...");
    }
}
