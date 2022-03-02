package com.like3ong.design.creatation.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class VanCar extends AbstractCar implements ICar<List<Object>>{
    @Override
    public List<Object> run(List<Object> gasoline) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("vancar");
        gasoline.addAll(objects);
        System.out.println("van car");
        return objects;
    }
}
