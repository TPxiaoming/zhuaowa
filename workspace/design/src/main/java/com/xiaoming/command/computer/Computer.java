package com.xiaoming.command.computer;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Computer {
    public static void main(String[] args) {
        //1.把命令和真正的实现组合起来，相当于在组装机器
        //把机箱上按钮的连接线接到主板上
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);

        //2.为机箱上的按钮设置对应的命令，让按钮知道该干什么
        Box box = new Box();
        box.setCommand(openCommand);

        //3.然后模拟按下机箱上的按钮
        box.openButtonPressed();
    }
}
