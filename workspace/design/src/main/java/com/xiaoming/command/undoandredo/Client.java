package com.xiaoming.command.undoandredo;

/**
 * 客户端
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command concreteCommandOne = new ConcreteCommandOne(receiver);
        Command concreteCommandTwo = new ConcreteCommandTwo(receiver);

        Invoker invoker = new Invoker(concreteCommandOne, concreteCommandTwo);
        invoker.actionOne();
        invoker.actionTwo();
    }
}
