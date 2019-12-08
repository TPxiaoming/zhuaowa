package com.xiaoming.strategy.demo;

public interface Strategy {
    /**
     * 计算充值金额
     * @param charge 费用
     * @param type 充值类型
     * @return
     */
    Double calRecharge(Double charge, RechargeTypeEnum type);
}