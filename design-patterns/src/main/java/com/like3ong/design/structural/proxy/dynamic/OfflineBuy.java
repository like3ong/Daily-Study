package com.like3ong.design.structural.proxy.dynamic;

import lombok.Data;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
@Data
public class OfflineBuy implements ITrainStation  {



    public OfflineBuy() {
    }

    @Override
    public void buyTrainTicket() {
        System.out.println("线下购买火车票");
    }

    /**
     * JDK代理模式不能代理这个代理对象类中自己的方法，proxy只能转成接口类
     * @param price
     */
    public void buyAirTicket(IAirportStation airportStation,Integer price){
        String s = airportStation.sellAirTicket(price);
        System.out.println(s);
    }


}
