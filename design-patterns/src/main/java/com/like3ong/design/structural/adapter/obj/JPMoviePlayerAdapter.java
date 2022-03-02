package com.like3ong.design.structural.adapter.obj;

import com.like3ong.design.structural.adapter.IPlayer;
import com.like3ong.design.structural.adapter.ITranslator;
import com.like3ong.design.structural.adapter.Zh2JpTranslator;

/**
 * @author like3ong
 * @date 2022/3/2
 **/
/**
 * 组合的方式
 *
 * */
public class JPMoviePlayerAdapter implements IPlayer {

    private final ITranslator translator = new Zh2JpTranslator();
    private final IPlayer tarPlayer;

    public JPMoviePlayerAdapter(IPlayer tarPlayer) {
        this.tarPlayer = tarPlayer;
    }


    @Override
    public String play() {
        String play = tarPlayer.play();
        return translator.translate(play);
    }
}
