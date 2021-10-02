package com.like3ong.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.service.UserService;
import com.like3ong.mybatisplusdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 * @author 10587
 * 这是一个测试，测试1,bug分支
 * 修复bug
 *
 *
 * 修复第三个bug
 * 修复另一个bug
 * 修复bug1
<<<<<<<<< Temporary merge branch 1
<<<<<<<<< Temporary merge branch 1
 * 修复另一个bug
=========
 * 修复bug1
>>>>>>>>> Temporary merge branch 2
=========
 *
 *
 * 修复第三个bug
>>>>>>>>> Temporary merge branch 2
 */
@Service
@RestController
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{
    private final UserService userService;

    public UserServiceImpl(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/hi")
    public String sayHi(){
        List<User> userList = userService.list();
        String s = userList.toString();
        return s;
    }

}




