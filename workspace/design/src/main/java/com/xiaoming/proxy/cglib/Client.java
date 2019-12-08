package com.xiaoming.proxy.cglib;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Client {
    public static void main(String[] args) {
        CglibInterceptor cglib = new CglibInterceptor();
        HelloConcrete helloConcrete = (HelloConcrete) cglib.getInstance(new HelloConcrete());
        helloConcrete.sayHello("xiaoming");
    }
}
