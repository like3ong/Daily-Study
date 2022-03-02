package com.like3ong.design.creatation.factory.abstractfactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MiniCar extends AbstractCar implements ICar<String> {

    public MiniCar(String mini, String price) {
        this.engine = mini;
        this.price = price;
    }


    @Override
    public String run(String gasoline) {
        gasoline = "#92";
        System.out.println("minicar---run"+gasoline);
        return gasoline;
    }
}
