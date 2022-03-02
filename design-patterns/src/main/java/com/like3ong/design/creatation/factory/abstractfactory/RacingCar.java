package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class RacingCar<T> extends AbstractCar implements ICar<Integer>{


    @Override
    public Integer run(Integer gasoline) {
        gasoline = 32;
        System.out.println("minicar---run"+gasoline);
        return  gasoline;
    }
}
