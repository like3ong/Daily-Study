package com.like3ong.design.creatation.factory.factorymethod;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class WulinRacingCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new RacingCar();
    }
}
