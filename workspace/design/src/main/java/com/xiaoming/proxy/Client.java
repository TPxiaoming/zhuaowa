package com.xiaoming.proxy;

import java.lang.reflect.Proxy;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Client {
    public static void main(String[] args) {
        /*Subject proxySubject = new ProxySubject();
        proxySubject.requeset();*/
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        Subject realSubject = new RealSubject();
        DynamicProxy proxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject subject = (Subject) Proxy.newProxyInstance(classLoader, realSubject.getClass().getInterfaces(), proxy);
        subject.requeset();
    }
}
