package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/27
 **/
public class FactoryProducer {
    /**
     *
     * @param choice wulinWuhanCarFactory or wulinwuhanMaskFactory
     * @return
     */
    public static WulinFactory getFactory(String choice) {
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("wulinWuhanCarFactory")) {
            return new WulinWuhanCarFactory();
        }else if (choice.equalsIgnoreCase("wulinwuhanMaskFactory")) {
            return new WulinWuhanMaskFactory();
        }
        return null;
    }
}
