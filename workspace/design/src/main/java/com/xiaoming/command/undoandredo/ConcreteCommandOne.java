package com.xiaoming.command.undoandredo;

/**
 * 命令实现one
 * @author xiaoming
 * @Date 2019/12/1
 */
public class ConcreteCommandOne implements Command {
    private Receiver receiver;

    public ConcreteCommandOne(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionOne();
    }
}
