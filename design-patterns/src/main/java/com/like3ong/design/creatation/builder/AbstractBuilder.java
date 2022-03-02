package com.like3ong.design.creatation.builder;

/**
 * @author like3ong
 * @date 2022/3/1
 **/
public abstract class AbstractBuilder {
    Phone phone;
    abstract AbstractBuilder customCpu(String cpu);
    abstract AbstractBuilder customMem(String mem);
    abstract AbstractBuilder customDisk(String disk);
    Phone getPhone() {
        return phone;
    }

}
