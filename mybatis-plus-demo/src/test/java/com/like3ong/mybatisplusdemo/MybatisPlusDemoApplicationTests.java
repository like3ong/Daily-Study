package com.like3ong.mybatisplusdemo;


import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.mapper.UserMapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;


import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Resource
    private UserMapper userMapper;
    @Test
    @DisplayName("测试displayName注解1")
    public void testSelect(){
        System.out.println("测试查询-------------");
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(10,userList.size());
        userList.forEach(System.out::println);

    }

}
