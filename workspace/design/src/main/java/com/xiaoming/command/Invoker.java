package com.xiaoming.command;

/**
 * 请求者角色类
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Invoker {

    private Command command = null;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
