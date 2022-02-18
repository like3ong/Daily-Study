package com.like3ong.mybatisplusdemo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
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
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;

@SpringBootTest
class MybatisPlusDemoApplicationTests {

    @Resource
    private UserService userService;
    private User user;

    @Test
    @DisplayName("测试displayName注解1")
    public void testSelect(){
        System.out.println("测试查询-------------");
        int userList = userService.list().size();
        Assertions.assertEquals(12,userList);
    }

    @Test
    @DisplayName("测试demo")
    public void test1(){
        for(int i=0;i<10;i++){
            try {
                try {
                    if(i % 3==0){
                        throw new Exception("E0");
                    }
                    System.out.println(i);
                }catch (Exception e){
                    i *= 2;
                    if(i %3 == 0){
                        throw new Exception("E1");
                    }
                }finally {
                    ++ i;
                }
            }catch (Exception e){
                i +=3;
            }finally {
                -- i;
            }
        }
    }
    @Test
    public void test2(){
        Instant now = Instant.now();
        System.out.println(now.toString());
        System.out.println(now.toEpochMilli());
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(now, ZoneId.systemDefault());
        System.out.println(zonedDateTime);


    }
    @Test
    public void test3(){
        boolean flag = false;


    }
}













