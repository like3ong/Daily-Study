package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/28
 **/
public class Context <T> {
    private final ICar<T> icar;

    public Context(ICar<T> icar) {
        this.icar = icar;
    }
    public T run(T gasoline) {
        return icar.run(gasoline);
    }
}
