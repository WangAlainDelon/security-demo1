package com.wx.securitydemo1.service;


import com.wx.securitydemo1.domain.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: wangxiang
 * Date: 2019/9/21
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User insert(String userName, String passWord);

    List<User> queryUserByuserName(User user);

    List<User> list(User user);
}
