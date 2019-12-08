package com.xiaoming.factory;

/**
 * 不使用工厂模式
 * @author xiaoming
 * @Date 2019/11/30
 */
public class Test1 {
    public static void main(String[] args) {
        BMW320 bmw320 = new BMW320();
        BMW523 bmw523 = new BMW523();
    }
}

class BMW320{
    public BMW320(){
        System.out.println("制造-->BMW320");
    }
}

class BMW523{
    public BMW523(){
        System.out.println("制造-->BMW523");
    }
}
