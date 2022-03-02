package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class N95Mask extends AbstractMask{

    public N95Mask(){
        this.price = price;
    }
    @Override
    public void protect() {
        System.out.println("N95-protect");
    }
}
