package com.like3ong.design.creatation.factory.abstractproxyfactory;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public class IIRCacheAdapter implements ICacheAdapter{

    private IIR iir = new IIR();
    @Override
    public void set(String key, String value) {
        iir.set(key, value);
    }

    @Override
    public void del(String key) {
        iir.del(key);
    }
}
