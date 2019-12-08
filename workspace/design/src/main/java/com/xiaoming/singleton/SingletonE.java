package com.xiaoming.singleton;

/**
 * 饿汉式单例，类初始化的时候，就会创建对象，天生线程安全，调用效率比较高，
 * 如果在不使用对象的时候，会浪费内存
 * @author xiaoming
 * @Date 2019/12/1
 */
public class SingletonE {
    private static SingletonE instance = new SingletonE();

    private SingletonE(){

    }

    public static SingletonE getInstance(){
        return instance;
    }
}
