package com.like3ong.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.like3ong.mybatisplusdemo.domain.User;
import com.like3ong.mybatisplusdemo.service.UserService;
import com.like3ong.mybatisplusdemo.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author 10587
 * 这是一个测试，测试1,bug分支
 * 修复bug
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
implements UserService{

}




