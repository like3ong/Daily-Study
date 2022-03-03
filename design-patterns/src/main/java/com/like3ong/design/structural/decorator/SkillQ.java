package com.like3ong.design.structural.decorator;

/**
 * @author like3ong
 * @date 2022/3/3
 **/

/**
 * 对Skills的增强
 */
public class SkillQ extends Skills{
    private final String skillName;

    public SkillQ(IHero hero, String skillName) {
        super(hero);
        this.skillName = skillName;
    }

    @Override
    public void hasSkills() {
        super.hasSkills();
        setSkill();

    }

    private void setSkill(){
        System.out.println("Q技能:"+skillName);
    }
}
