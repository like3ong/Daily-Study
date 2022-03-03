package com.like3ong.design.structural.decorator;

/**
 * @author like3ong
 * @date 2022/3/3
 **/
public class MainTest {
    public static void main(String[] args) {

        SkillQ skillQ = new SkillQ(new LolHero("瞎子"), "天音波");
        skillQ.hasSkills();
    }
}
