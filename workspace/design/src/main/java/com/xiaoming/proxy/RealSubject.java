package com.xiaoming.proxy;

/**
 * 真实角色
 * @author xiaoming
 * @Date 2019/12/1
 */
public class RealSubject implements Subject {
    @Override
    public void requeset() {
        System.out.println("真实角色做的事情");
    }
}
