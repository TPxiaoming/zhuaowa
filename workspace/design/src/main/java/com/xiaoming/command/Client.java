package com.xiaoming.command;

/**
 * 客户端角色类
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Client {
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();

        //创建命令对象，设定它的接收者
        ConcreteCommand command = new ConcreteCommand(receiver);

        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);

        //执行方法
        invoker.action();

    }
}
