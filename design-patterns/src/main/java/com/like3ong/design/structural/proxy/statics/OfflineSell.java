package com.like3ong.design.structural.proxy.statics;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class OfflineSell implements ITrainTicket{
    @Override
    public void sell() {
        System.out.println("线下售卖");
    }
}
