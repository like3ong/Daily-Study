package com.like3ong.mybatisplusdemo;


import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.mapper.UserMapper;

import com.like3ong.mybatisplusdemo.service.UserService;
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
    private UserService userService;
    @Test
    @DisplayName("测试displayName注解1")
    public void testSelect(){
        System.out.println("测试查询-------------");
        int userList = userService.list().size();
        Assertions.assertEquals(12,userList);
    }

}
