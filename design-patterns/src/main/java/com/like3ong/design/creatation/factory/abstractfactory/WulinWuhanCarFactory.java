package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class WulinWuhanCarFactory extends WulinCarFactory{

    @Override
    AbstractCar newCar(String carType) {
        if (carType == null) {
            return null;
        }
        if (carType.equalsIgnoreCase("RacingCar")) {
            return new RacingCar();
        }else if (carType.equalsIgnoreCase("MiniCar")) {
            return new MiniCar("mini","100");
        }else if (carType.equalsIgnoreCase("VanCar")) {
            return new VanCar();
        }
        return null;
    }

    /**
     * 五菱汽车厂造口罩
     * @return
     * @param maskType
     */
    @Override
    AbstractMask newMask(String maskType) {
        if (maskType == null) {
            return null;
        }
        if (maskType.equalsIgnoreCase("N95Mask")) {
            return new N95Mask();
        }
        return null;
    }

}
