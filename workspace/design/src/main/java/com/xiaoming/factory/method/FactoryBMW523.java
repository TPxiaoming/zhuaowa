package com.xiaoming.factory.method;

/**
 * 宝马523工厂 用来生产 宝马523
 * @author xiaoming
 * @Date 2019/11/30
 */
public class FactoryBMW523 implements FactoryBMW{
    @Override
    public BMW createBMW() {
        return new BMW523();
    }
}
