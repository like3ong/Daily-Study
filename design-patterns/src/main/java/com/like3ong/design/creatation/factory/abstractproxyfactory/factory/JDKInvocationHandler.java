package com.like3ong.design.creatation.factory.abstractproxyfactory.factory;

import cn.hutool.core.util.ClassLoaderUtil;
import com.like3ong.design.creatation.factory.abstractproxyfactory.ICacheAdapter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public class JDKInvocationHandler implements InvocationHandler {


    private ICacheAdapter icacheAdapter;

    public JDKInvocationHandler(ICacheAdapter icacheAdapter) {
        this.icacheAdapter = icacheAdapter;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(icacheAdapter,args);
    }
}
