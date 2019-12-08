package com.xiaoming.strategy.demo;

/**
 * 商户账号充值打9折
 * @author xiaoming
 * @Date 2019/12/1
 */
public class BusiAcctStrategy implements Strategy {
    @Override
    public Double calRecharge(Double charge, RechargeTypeEnum type) {
        return charge * 0.90;
    }
}
