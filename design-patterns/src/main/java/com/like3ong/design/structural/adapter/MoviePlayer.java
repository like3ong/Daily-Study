package com.like3ong.design.structural.adapter;

import javax.xml.soap.SAAJResult;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class MoviePlayer implements IPlayer{
    @Override
    public String play() {
        System.out.println("电影播放器开始播放");
        String content = "你好";
        System.out.println(content);
        return content;
    }
}
