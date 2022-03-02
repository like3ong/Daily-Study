package com.like3ong.design.creatation.protootype;

import lombok.Data;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
@Data
public class User implements Cloneable{
    private String userName;
    private String age;


    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
