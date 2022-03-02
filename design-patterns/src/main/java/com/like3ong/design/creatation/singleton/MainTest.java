package com.like3ong.design.creatation.singleton;

/**
 * @author like3ong
 * @date 2022/2/18
 **/
public class MainTest {
    public static void main(String[] args) {

        // Person person = new Person();
        Person person1 = Person.createPerson();
        Person person = Person.createPerson();
        System.out.println(person.getName());
        System.out.println(person1.getName());

    }
}
