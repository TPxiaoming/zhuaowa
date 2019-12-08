package com.xiaoming.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class DestorySingleton {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        SingletonL instance1 = SingletonL.getInstance();
        SingletonL instance2 = SingletonL.getInstance();
        System.out.println(instance1 == instance2);

        Class<SingletonL> aClass = (Class<SingletonL>) Class.forName("com.xiaoming.singleton.SingletonL");
        Constructor<SingletonL> constructor = aClass.getDeclaredConstructor(null);
        //设置可以访问私有
        constructor.setAccessible(true);
        SingletonL singletonL1 = constructor.newInstance();
        SingletonL singletonL2 = constructor.newInstance();
        System.out.println(singletonL1 == singletonL2);
    }
}
