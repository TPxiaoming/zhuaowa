package com.xiaoming.singleton;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class SingletonDCL {
    private volatile static SingletonDCL uniqueSingleton;
    private SingletonDCL(){

    }

    public static SingletonDCL getInstance(){
        if (null == uniqueSingleton){
            synchronized (SingletonDCL.class){
                if (null == uniqueSingleton){
                    uniqueSingleton = new SingletonDCL();
                }
            }
        }
        return uniqueSingleton;
    }
}
