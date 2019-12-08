package com.xiaoming.factory.method;

/**
 * 宝马320工厂 用来生产 宝马320
 * @author xiaoming
 * @Date 2019/11/30
 */
public class FactoryBMW320 implements FactoryBMW {
    @Override
    public BMW createBMW() {
        return new BMW320();
    }
}
