package com.like3ong.design.structural.proxy.dynamic;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class XiamenAirportStation implements IAirportStation{
    public XiamenAirportStation() {
    }

    @Override
    public String sellAirTicket(Integer price) {
        System.out.println("厦门机场购票的价格："+ price);
        return "出票成功";
    }
}
