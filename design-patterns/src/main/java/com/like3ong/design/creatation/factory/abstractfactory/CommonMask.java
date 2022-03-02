package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public class CommonMask extends AbstractMask{
    @Override
    public void protect() {
        System.out.println("普通口罩");
    }
}
