package com.xiaoming.strategy.demo;

/**
 * 手机充值类型，原价充值
 * @author xiaoming
 * @Date 2019/12/1
 */
public class MobileStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge;
    }
}
