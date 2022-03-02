package com.like3ong.design.structural.bridge;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class PenOne extends AbstractPen {


    @Override
    void draw(AbstractColor color) {
        System.out.println("一号笔"+color.setName()+"draw");
    }
}
