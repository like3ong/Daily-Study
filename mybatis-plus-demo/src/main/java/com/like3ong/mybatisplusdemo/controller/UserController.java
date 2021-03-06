package com.like3ong.mybatisplusdemo.controller;

import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author like3ong
 * @Date 2021/10/2 23:48
 **/
@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/hi")
    public String sayHi(){
        log.info("查询user列表");
        List<User> list = userService.list();
        String s = list.toString();
        System.out.println("ceshi");
        System.out.println("fix 测试");
        System.out.println("tijao ");
        System.out.println("buding");
        System.out.println("xiuhu 不定");
        return s;

    }

    @RequestMapping("/user/{uid}")
    public User getUserOne(@PathVariable String uid){
        return userService.getById(uid);
    }

}
