package com.lirj.dyncproxy;

public class DyncUserDao implements IDyncUserDao {
    @Override
    public void save() {
        System.out.println("保存数据成功!");
    }
}
