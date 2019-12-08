package com.xiaoming.singleton;

/**
 * 懒汉式单例
 * @author xiaoming
 * @Date 2019/12/1
 */
public class SingletonL {
    private SingletonL(){
        if (null!= SingletonL.getInstance()){
            throw new RuntimeException();
        }
    }
    public static SingletonL getInstance(){
        return Holder.SINGLE_TON;
    }

    private static  class Holder{
        private static final SingletonL SINGLE_TON = new SingletonL();
    }
}
