package com.like3ong.design.creatation.factory.factorymethod;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class WulinMiniCarFactory extends AbstractCarFactory{
    @Override
    public AbstractCar newCar() {
        return new MiniCar("mini","180000");
    }
}
