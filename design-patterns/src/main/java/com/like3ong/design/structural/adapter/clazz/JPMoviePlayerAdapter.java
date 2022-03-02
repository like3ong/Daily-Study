package com.like3ong.design.structural.adapter.clazz;

import com.like3ong.design.structural.adapter.IPlayer;
import com.like3ong.design.structural.adapter.Zh2JpTranslator;

/**
 * @author like3ong
 * @date 2022/3/2
 **/

/**
 * 类结构型
 */
public class JPMoviePlayerAdapter extends Zh2JpTranslator implements IPlayer {

    private final IPlayer tarPlayer;

    public JPMoviePlayerAdapter(IPlayer tarPlayer) {
        this.tarPlayer = tarPlayer;
    }


    @Override
    public String play() {
        String play = tarPlayer.play();
        return translate(play);
    }
}
