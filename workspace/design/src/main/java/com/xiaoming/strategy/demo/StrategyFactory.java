package com.xiaoming.strategy.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例工厂创建策略
 * @author xiaoming
 * @Date 2019/12/1
 */
public class StrategyFactory {

    private static  StrategyFactory  factory = new StrategyFactory();

    private StrategyFactory(){

    }

    private static Map<Integer, Strategy> strategyMap = new HashMap<>();

    static {
        strategyMap.put(RechargeTypeEnum.E_BANK.value(), new EBankStrategy());
        strategyMap.put(RechargeTypeEnum.BUSI_ACCOUNT.value(), new BusiAcctStrategy());
        strategyMap.put(RechargeTypeEnum.MOBILE.value(), new MobileStrategy());
    }

    /**
     * 获取具体策略
     * @param type
     * @return
     */
    public Strategy creator(Integer type){
        return strategyMap.get(type);
    }

    public static StrategyFactory getInstance() {
        return factory;
    }
}
