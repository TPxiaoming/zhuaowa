package com.xiaoming.strategy;

/**
 * 客户端
 * @author xiaoming
 * @Date 2019/11/30
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();
    }
}
