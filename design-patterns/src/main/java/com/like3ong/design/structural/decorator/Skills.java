package com.like3ong.design.structural.decorator;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class Skills implements IHero{

    private IHero hero;

    public Skills(IHero hero) {
        this.hero = hero;
    }

    @Override
    public void hasSkills() {
        if (hero != null) {
            hero.hasSkills();
        }
    }
}
