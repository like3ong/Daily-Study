package com.like3ong.design.creatation.factory.factorymethod;

import cn.hutool.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author like3ong
 * @date 2022/2/19
 **/

public class MainTest {
    public static void main(String[] args) {
        WulinMiniCarFactory wulinMiniCarFactory = new WulinMiniCarFactory();
        AbstractCar abstractCar = wulinMiniCarFactory.newCar();
        String s = JSONUtil.toJsonStr(abstractCar);
        System.out.println(s);
        System.out.println(abstractCar);
        System.out.println(abstractCar.price);
        abstractCar.run();
    }
}
