package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 * 总厂规范
 **/

public abstract class WulinFactory  {

    String belong = "五菱集团总工厂规范";
    abstract AbstractCar newCar(String carType);
    abstract AbstractMask newMask(String maskType);



}
