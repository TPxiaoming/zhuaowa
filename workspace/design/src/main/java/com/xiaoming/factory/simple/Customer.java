package com.xiaoming.factory.simple;

/**
 * 客户类
 * @author xiaoming
 * @Date 2019/11/30
 */
public class Customer {
    public static void main(String[] args) {
        Factory factory = new Factory();
        //生产宝马320
        factory.createBMW(320);
        //生产宝马523
        factory.createBMW(523);
    }
}
