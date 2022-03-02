package com.like3ong.design.creatation.protootype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author like3ong
 * @date 2022/2/19
 **/
public class MybatisPojo {

    // 缓存user
    private final Map<String,User> userCache = new HashMap<>();

    public User getUser(String userName) {
        User user = null;
        if (!userCache.containsKey(userName)) {
            user = getUserForDb(userName);
        }else {
            user = userCache.get(userName);
            // 快速拿到一个克隆体

        }
        return user;
    }

    //从数据库中查到的
    private User getUserForDb(String userName) {
        User user = new User();
        user.setUserName(userName);
        user.setAge("18");
        User clone = user.clone();
        userCache.put(userName,clone);
        System.out.println("创建user用户"+userName);
        return user;
    }
}
