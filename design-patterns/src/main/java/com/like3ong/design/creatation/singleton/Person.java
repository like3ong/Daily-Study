package com.like3ong.design.creatation.singleton;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author like3ong
 * @date 2022/2/18
 **/
public class Person {


    private String name;
    private String age;

    // 在访问volatile变量时不会执行加锁操作，因此也就不会使执行线程阻塞，因此volatile变量是一种比sychronized关键字更轻量级的同步机制。
    private volatile static Person personInstance;
    // 构造器私有，外部不能实例化
    private Person(){
        System.out.println("创建Person");
    }

    // 提供给外部的方法
    public static Person createPerson(){

        if (personInstance == null) {
            synchronized (Person.class){
                if (personInstance == null) {
                    Person person = new Person();
                    personInstance = person;
                }
            }
        }
        return personInstance;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
