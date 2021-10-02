package com.like3ong.mybatisplusdemo.controller;

import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author like3ong
 * @Date 2021/10/2 23:48
 **/
@RestController
public class UserContronller {
    private static Logger log = LoggerFactory.getLogger(UserContronller.class);
    @Autowired
    private UserService userService;
    @GetMapping("/hi")
    public String sayHi(){
        log.info("查询user列表");
        log.debug("查询user");
        List<User> userList = userService.list();
        String s = userList.toString();
        return s;
    }

    @RequestMapping("/user/{uid}")
    public User getUserOne(@PathVariable String uid){
        return userService.getById(uid);
    }

}
