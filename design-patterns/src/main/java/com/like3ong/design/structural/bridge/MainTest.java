package com.like3ong.design.structural.bridge;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class MainTest {
    public static void main(String[] args) {
        PenAdapter penAdapter = new PenAdapter(new PenOne());
        penAdapter.doDraw(new Blue());

        PenAdapter penAdapter1 = new PenAdapter(new PenTwo());
        penAdapter1.doDraw(new Red());
    }
}
