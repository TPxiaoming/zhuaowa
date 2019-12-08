package com.xiaoming.strategy.demo;

/**
 * @author xiaoming
 * @Date 2019/12/1
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Double aDouble = context.calRecharge(100D, RechargeTypeEnum.E_BANK.value());
        System.out.println(RechargeTypeEnum.E_BANK.description() + "需要" +aDouble);

        Double aDouble1 = context.calRecharge(100D, RechargeTypeEnum.BUSI_ACCOUNT.value());
        System.out.println(RechargeTypeEnum.BUSI_ACCOUNT.description() + "需要" +aDouble1);

        Double aDouble2 = context.calRecharge(100D, RechargeTypeEnum.MOBILE.value());
        System.out.println(RechargeTypeEnum.MOBILE.description() + "需要" +aDouble2);
    }
}
