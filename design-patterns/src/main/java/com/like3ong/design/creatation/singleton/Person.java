package com.like3ong.design.creatation.singleton;

/**
 * @author like3ong
 * @date 2022/2/18
 **/
public class Person {
    private String name;
    private String age;


    private volatile static Person personInstance;
    // 构造器私有，外部不能实例化
    private Person(){

    }

    // 提供给外部的方法
    public static Person createPerson(){

        if (personInstance == null) {
            synchronized (Person.class){
                if (personInstance == null) {
                    personInstance = new Person();
                }
            }
        }
        return personInstance;

    }
}
