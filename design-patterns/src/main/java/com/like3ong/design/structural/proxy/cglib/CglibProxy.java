package com.like3ong.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class CglibProxy {

    public static <T> T createProxy (T target){

        // 创建字节码增强器
        Enhancer enhancer = new Enhancer();
        // 设置代理对象的父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调，在调用中拦截对目标方法的调用
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {

            // 拦截逻辑
            System.out.println("cglib中的方法拦截器---前置通知");
            Object invokeSuper = methodProxy.invokeSuper(o, objects);
            System.out.println("cglib中的方法拦截器---后置通知");
            return invokeSuper;

        });
        // 代理类创建
        Object o = enhancer.create();
        return (T) o;
    }

}
