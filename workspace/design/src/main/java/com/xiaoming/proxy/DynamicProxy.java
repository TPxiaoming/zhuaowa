package com.xiaoming.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class DynamicProxy implements InvocationHandler {
    private Object object;

    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始运行");
        Object result = method.invoke(object, args);
        System.out.println("代理结束运行");
        return result;
    }
}
