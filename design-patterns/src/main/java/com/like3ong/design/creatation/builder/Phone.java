package com.like3ong.design.creatation.builder;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author like3ong
 * @date 2022/3/1
 **/
@SuperBuilder(toBuilder = true)
@ToString
public class Phone extends AbstractMachine{

    protected String cpu;
    protected String mem;
    protected String disk;



}
