package com.xiaoming.strategy.demo;

/**
 * 网银充值打85折
 * @author xiaoming
 * @Date 2019/12/1
 */
public class EBankStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.85;
    }
}
