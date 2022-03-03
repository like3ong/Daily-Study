package com.like3ong.design.structural.proxy.statics;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class MainTest {
    public static void main(String[] args) {

        TrainTicketProxy trainTicketProxy = new TrainTicketProxy(new OfflineSell());
        trainTicketProxy.sell();

    }
}
