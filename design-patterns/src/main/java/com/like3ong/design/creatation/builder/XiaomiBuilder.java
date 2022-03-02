package com.like3ong.design.creatation.builder;

import lombok.NoArgsConstructor;

/**
 * @author like3ong
 * @date 2022/3/1
 **/

public class XiaomiBuilder extends AbstractBuilder{

    public XiaomiBuilder() {
        phone = Phone.builder().build();
    }

    @Override
    AbstractBuilder customCpu(String cpu) {
        phone.cpu = cpu;
        return this;
    }

    @Override
    AbstractBuilder customMem(String mem) {
        phone.mem = mem;
        return this;
    }

    @Override
    AbstractBuilder customDisk(String disk) {
        phone.disk = disk;
        return this;
    }
}
