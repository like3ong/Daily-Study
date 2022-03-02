package com.like3ong.design.creatation.protootype;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class MainTest {
    public static void main(String[] args) {
        MybatisPojo mybatisPojo = new MybatisPojo();
        User zhangsan = mybatisPojo.getUser("zhangsan");
        zhangsan.setUserName("wangwu");
        System.out.println(zhangsan);
        User dfsdf = mybatisPojo.getUser("dfsdf");
        System.out.println(dfsdf);
        User zhangsan1 = mybatisPojo.getUser("zhangsan");
        System.out.println(zhangsan1);
        User zhangsan2 = mybatisPojo.getUser("zhangsan");
        System.out.println(zhangsan2);
        System.out.println(zhangsan1 == zhangsan2);

    }
}
