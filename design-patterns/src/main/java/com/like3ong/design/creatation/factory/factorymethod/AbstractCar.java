package com.like3ong.design.creatation.factory.factorymethod;

import lombok.Data;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
@Data
public abstract class AbstractCar {
    String engine;
    String price;

    public abstract void run();

}
