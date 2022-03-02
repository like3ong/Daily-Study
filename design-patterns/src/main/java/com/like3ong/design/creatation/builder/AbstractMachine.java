package com.like3ong.design.creatation.builder;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * @author like3ong
 * @date 2022/3/1
 **/
@Data
@SuperBuilder(toBuilder = true)
public  class AbstractMachine {
    private  String name = "Made in china";

}
