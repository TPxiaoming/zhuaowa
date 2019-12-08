package com.xiaoming.factory.simple;

/**
 * 汽车工厂类
 * @author xiaoming
 * @Date 2019/11/30
 */
public class Factory {
    public BMW createBMW(int type){
        switch (type){
            case 320:
                return new BMW320();
            case 523:
                return new BMW523();

                default:
                    break;
        }
        return null;
    }
}
