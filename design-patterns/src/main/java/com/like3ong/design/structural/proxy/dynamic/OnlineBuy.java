package com.like3ong.design.structural.proxy.dynamic;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class OnlineBuy implements ITrainStation {

    @Override
    public void buyTrainTicket() {
        System.out.println("线上购买火车票");
    }
}
