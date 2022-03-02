package com.like3ong.design.creatation.factory.abstractfactory;

/**
 * @author like3ong
 * @date 2022/2/25
 **/
public interface ICar<T> {
    T run(T gasoline);
}
