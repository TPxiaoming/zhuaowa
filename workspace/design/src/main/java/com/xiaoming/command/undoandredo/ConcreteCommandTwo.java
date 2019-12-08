package com.xiaoming.command.undoandredo;

/**
 * 命令实现two
 * @author xiaoming
 * @Date 2019/12/1
 */
public class ConcreteCommandTwo implements  Command {
    private Receiver receiver;

    public ConcreteCommandTwo(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionTwo();
    }
}
