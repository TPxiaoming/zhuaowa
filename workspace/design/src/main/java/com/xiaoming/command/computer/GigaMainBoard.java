package com.xiaoming.command.computer;

/**
 * 技嘉主板类，开机命令的真正实现者，在 Command 模式中充当 Receiver
 * @author xiaoming
 * @Date 2019/12/1
 */
public class GigaMainBoard implements MainBoardApi {
    boolean status;

    //业务属性 a,b,c,d

    /**
     * 真正的开机命令的实现
     */
    @Override
    public void open() {
        try {
            System.out.println("技嘉主板现在正在开机，请等候");
            System.out.println("接通电源......");
            System.out.println("设备检查......");
            System.out.println("装载系统......");
            System.out.println("机器正常运转起来......");
            System.out.println("机器已经正常打开，请操作");
            status = true;
        } catch (Exception e) {
            status = false;
        }
    }

    public void colse(){
        // 两种方案
        // 1、改status
        // 2、a计数，a-1

    }
}
