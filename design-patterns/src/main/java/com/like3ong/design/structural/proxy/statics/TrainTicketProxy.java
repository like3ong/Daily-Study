package com.like3ong.design.structural.proxy.statics;

/**
 * @author like3ong
 * @date 2022/3/3
 **/

/**
 * 静态代理的对象类型单一，如 Person，Animal 。。。。不方便扩展
 */
public class TrainTicketProxy implements ITrainTicket{

    private final ITrainTicket iTrainTicket;

    public TrainTicketProxy(ITrainTicket iTrainTicket) {
        this.iTrainTicket = iTrainTicket;
    }

    @Override
    public void sell() {
        System.out.println("进入代理");
        iTrainTicket.sell();
    }
}
