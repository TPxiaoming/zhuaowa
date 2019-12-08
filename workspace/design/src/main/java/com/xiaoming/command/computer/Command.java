package com.xiaoming.command.computer;

/**
 * 命令接口，声明执行的操作
 * @author xiaoming
 * @Date 2019/12/1
 */
public interface Command {
    /**
     * 执行命令对应的操作
     */
    void execute();
}
