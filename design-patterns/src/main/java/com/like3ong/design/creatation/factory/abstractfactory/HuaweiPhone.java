package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/28
 **/
public class HuaweiPhone extends AbstractMobilePhone{
    private String price;

    @Override
    void call() {
        System.out.println("huaweicall");
    }

    @Override
    String has5G() {
        return "yes";
    }
}
