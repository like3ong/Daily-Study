package com.like3ong.design.creatation.builder;

/**
 * @author like3ong
 * @date 2022/3/1
 **/
public class MainTest {
    public static void main(String[] args) {

        // XiaomiBuilder xiaomiBuilder = new XiaomiBuilder();
        // AbstractBuilder builder = xiaomiBuilder.customCpu("骁龙888").customDisk("128G").customMem("2222");
        // Phone phone = builder.getPhone();
        // System.out.println(phone);

        Phone.PhoneBuilder<?, ?> builder = Phone.builder();
        Phone.PhoneBuilder<?,?> cpu = builder.cpu("1");
        System.out.println(cpu.toString());

    }
}
