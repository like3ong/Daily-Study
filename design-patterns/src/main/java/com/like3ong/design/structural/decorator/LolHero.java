package com.like3ong.design.structural.decorator;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class LolHero implements IHero {

    private String name;

    public LolHero(String name) {
        this.name = name;
    }

    @Override
    public void hasSkills() {
        System.out.println(name + "拥有的技能");
    }
}
