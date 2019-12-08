package com.xiaoming.factory.method;

/**
 * 客户类
 * @author xiaoming
 * @Date 2019/11/30
 */
public class Coustomer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createBMW();

        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createBMW();
    }
}
