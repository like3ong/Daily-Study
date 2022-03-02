package com.like3ong.design.creatation.factory.abstractproxyfactory;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public interface ICacheAdapter {
    void set(String key ,String value);
    void del(String key);
}
