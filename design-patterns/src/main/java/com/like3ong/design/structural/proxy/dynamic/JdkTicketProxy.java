package com.like3ong.design.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author like3ong
 * @date 2022/3/3
 *
 * JDK动态代理  ----  接口实现方式
 **/
public class JdkTicketProxy<T> implements InvocationHandler {
    public JdkTicketProxy(T target) {
        this.target = target;
    }

    private T target;

    public static <T> T getTicketProxy(T ticket){

        Object proxyInstance = Proxy.newProxyInstance(ticket.getClass().getClassLoader(), ticket.getClass().getInterfaces(), new JdkTicketProxy(ticket));

        return (T) proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target, args);
        return invoke;
    }
}
