package com.like3ong.design.creatation.factory.simplefactory;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class WulinSimpleFactory {

    public AbstractCar newCar(String type){
        if ("van".equals(type)) {
            return new VanCar();
        }else if ("mini".equals(type)) {
            return new MiniCar();
        }
        return null;
    }
}
