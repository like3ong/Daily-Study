package com.like3ong.design.creatation.factory.abstractproxyfactory;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public class EGMCacheAdapter implements ICacheAdapter{

    private EGM egm = new EGM();
    @Override
    public void set(String key, String value) {
        egm.setData(key, value);
    }

    @Override
    public void del(String key) {
        egm.delete(key);
    }
}
