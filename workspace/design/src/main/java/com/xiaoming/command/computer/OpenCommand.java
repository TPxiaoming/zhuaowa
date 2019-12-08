package com.xiaoming.command.computer;

/**
 * 开机命令的实现，实现 Command 接口，
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 * @author xiaoming
 * @Date 2019/12/1
 */
public class OpenCommand implements Command {

    /**
     * 持有真正实现命令的接收者——主板对象
     */
    private MainBoardApi mainBoardApi = null;

    public OpenCommand(MainBoardApi mainBoardApi){
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        //对于命令对象，根本不知道如何开机，会专调主板对象
        //让主板去完成开机的功能
        mainBoardApi.open();
    }
}
