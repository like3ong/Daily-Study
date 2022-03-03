package com.like3ong.design.structural.proxy.dynamic;

import com.like3ong.design.structural.proxy.cglib.CglibProxy;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class MainTest {
    public static void main(String[] args) {

        OfflineBuy proxy = CglibProxy.createProxy(new OfflineBuy());
        proxy.buyAirTicket(new XiamenAirportStation(),100);

    }
}
