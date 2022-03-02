package com.like3ong.design.structural.adapter;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class Zh2JpTranslator implements ITranslator{
    @Override
    public String translate(String content) {
        if ("你好".equals(content)) {
            return "kongnijiwa";
        }
        return "null";
    }
}
