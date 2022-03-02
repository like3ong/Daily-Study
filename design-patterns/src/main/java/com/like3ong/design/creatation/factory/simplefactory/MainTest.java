package com.like3ong.design.creatation.factory.simplefactory;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class MainTest {
    public static void main(String[] args) {
        WulinSimpleFactory wulinSimpleFactory = new WulinSimpleFactory();
        AbstractCar van = wulinSimpleFactory.newCar("van");
        System.out.println(van);
        van.run();
        AbstractCar mini = wulinSimpleFactory.newCar("mini");
        System.out.println(mini);
        mini.run();
    }
}
