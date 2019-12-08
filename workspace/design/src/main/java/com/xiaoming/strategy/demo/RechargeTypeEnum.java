package com.xiaoming.strategy.demo;

/**
 * 充值类型枚举
 * @author xiaoming
 * @Date 2019/12/1
 */
public enum RechargeTypeEnum {

    E_BANK(1,"网银"),

    BUSI_ACCOUNT(2,"商户账号"),

    MOBILE(3, "手机充值卡"),

    CARD_RECHARGE(4, "充值卡")
    ;

    private int value;

    private  String description;

    private RechargeTypeEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int value(){
        return value;
    }

    public String description(){
        return description;
    }

    public static RechargeTypeEnum valueOf(int value) {
        for (RechargeTypeEnum typeEnum : RechargeTypeEnum.values()) {
            if (typeEnum.value() == value) {
                return typeEnum;
            }
        }

        return E_BANK;
    }
}
