package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public abstract class WulinCarFactory extends WulinFactory {

    /**
     *
     * @param carType racingCar or miniCar or vanCar
     * @return
     */
    abstract AbstractCar newCar(String carType);

    /**
     * 五菱汽车厂造口罩
     * @return
     */
    abstract AbstractMask newMask(String maskType);

}
