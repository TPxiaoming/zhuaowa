package com.xiaoming.command.undoandredo;

/**
 * 请求者
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Invoker {

    private Command commandOne;

    private Command commandTwo;

    public Invoker(Command commandOne, Command commandTwo) {
        this.commandOne = commandOne;
        this.commandTwo = commandTwo;
    }

    public void actionOne(){
        commandOne.execute();
    }

    public void actionTwo(){
        commandTwo.execute();
    }
}
