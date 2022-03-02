package com.like3ong.design.structural.adapter.clazz;

import com.like3ong.design.structural.adapter.MoviePlayer;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
public class MainTest {
    public static void main(String[] args) {

        JPMoviePlayerAdapter jpMoviePlayerAdapter = new JPMoviePlayerAdapter(new MoviePlayer());
        String play = jpMoviePlayerAdapter.play();
        System.out.println(play);


    }
}
