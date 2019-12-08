package com.xiaoming.command.computer;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象——请求者角色类
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Box {
    /**
     * 开机命令对象
     */
    private Command command;

    /**
     * 设置开机命令对象
     * @param command 开机命令对象
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    public void openButtonPressed(){
        //按下按钮，执行命令
        command.execute();
    }
}
