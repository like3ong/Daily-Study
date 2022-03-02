package com.like3ong.design.structural.bridge;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class PenAdapter {
    private AbstractPen pen;

    public PenAdapter(AbstractPen pen) {
        this.pen = pen;
    }

    public void doDraw(AbstractColor color){
        pen.draw(color);
    }


}
