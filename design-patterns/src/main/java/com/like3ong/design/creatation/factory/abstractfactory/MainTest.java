package com.like3ong.design.creatation.factory.abstractfactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class MainTest {
    public static void main(String[] args) {


        // WulinCarFactory wulinWuhanCarFactory = (WulinCarFactory) FactoryProducer.getFactory("wulinWuhanCarFactory");
        // AbstractCar racingCar = wulinWuhanCarFactory.newCar("racingCar");
        // racingCar.run("92#");
        //
        //
        // AbstractMask n95Mask = wulinWuhanCarFactory.newMask("N95Mask");
        // n95Mask.protect();

        Context<String> context = new Context<>(new MiniCar("MINI", "10000"));
        String ce = context.run("ce");
        Context<List<Object>> listContext = new Context<>(new VanCar());
        ArrayList<Object> strings = new ArrayList<>();
        List<Object> run = listContext.run(strings);
        System.out.println(run.toString());
        System.out.println(ce);

    }
}
