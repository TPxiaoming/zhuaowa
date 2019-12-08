package com.xiaoming.proxy;

/**
 * 静态代理，对具体真实对象直接引用
 * 代理角色，代理角色需要有对真实角色的引用
 * 代理做真实角色想做的事情
 * @author xiaoming
 * @Date 2019/12/1
 */
public class ProxySubject implements Subject {
    private RealSubject realSubject = null;

    /**
     * 除了代理真实角色该做的事情，代理角色也可以提供附加操作
     * 如 preRequest() 和 postRequest()
     */
    @Override
    public void requeset() {
        preRequest();
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.requeset();
        postRequest();
    }

    /**
     * 真实角色操作后的附加操作
     */
    private void postRequest(){
        System.out.println("真实角色操作后的附加操作");
    }

    /**
     * 真实角色操作前的附加操作
     */
    private void preRequest(){
        System.out.println("真实角色操作前的附加操作");
    }
}
