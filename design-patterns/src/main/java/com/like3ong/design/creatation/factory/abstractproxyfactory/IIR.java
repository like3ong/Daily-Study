package com.like3ong.design.creatation.factory.abstractproxyfactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author like3ong
 * @date 2022/2/26
 **/
public class IIR {

    private final Map<String,String > dataMap = new ConcurrentHashMap<>();

    public void set (String key,String value){
        dataMap.put(key, value);
    }
    public void del (String key){
        dataMap.remove(key);
    }
}
