package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class WulinWuhanMaskFactory extends WulinMaskFactory{
    /**
     * 制造N95mask
     * @return n95mask
     */
    @Override
    public AbstractMask newMask() {
        return new N95Mask();
    }

    @Override
    AbstractCar newCar(String carType) {
        return null;
    }

    @Override
    AbstractMask newMask(String maskType) {
        return null;
    }
}
