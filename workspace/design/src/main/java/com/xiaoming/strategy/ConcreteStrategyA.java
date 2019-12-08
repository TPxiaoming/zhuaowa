package com.xiaoming.strategy;

/**
 * @author xiaoming
 * @Date 2019/11/30
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmLoginc() {
        System.out.println("具体的算法逻辑A");
    }
}
