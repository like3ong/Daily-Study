package com.like3ong.design.creatation.factory.factorymethod;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class MiniCar extends AbstractCar {

    public MiniCar(String mini, String price) {
        this.engine = mini;
        this.price = price;
    }

    @Override
    public void run() {
        System.out.println("mini");
    }
}
