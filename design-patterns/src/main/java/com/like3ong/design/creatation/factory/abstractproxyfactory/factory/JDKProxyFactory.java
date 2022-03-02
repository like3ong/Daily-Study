package com.like3ong.design.creatation.factory.abstractproxyfactory.factory;

import com.like3ong.design.creatation.factory.abstractproxyfactory.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public class JDKProxyFactory {

    public static <T> T getProxy(Class cacheClazz, Class<? extends ICacheAdapter> cacheAdapter) throws InstantiationException, IllegalAccessException {
        InvocationHandler jdkInvocationHandler = new JDKInvocationHandler(cacheAdapter.newInstance());
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return (T) Proxy.newProxyInstance(contextClassLoader,new Class[]{cacheClazz},jdkInvocationHandler);
    }

}
