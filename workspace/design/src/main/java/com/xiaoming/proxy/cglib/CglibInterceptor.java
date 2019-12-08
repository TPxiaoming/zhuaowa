package com.xiaoming.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 需要导入asmjar包，直接引入spring也可以，spring中带有asm jar 包
 * @author xiaoming
 * @Date 2019/12/1
 */
public class CglibInterceptor implements MethodInterceptor {

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        //操作字节码 生成虚拟子类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理前" );
        Object invoke = methodProxy.invoke(target, objects);
        System.out.println("代理后");
        return invoke;
    }
}
