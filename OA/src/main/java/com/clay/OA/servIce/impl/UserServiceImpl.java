package com.clay.OA.servIce.impl;

import com.clay.OA.mapper.UserMapper;
import com.clay.OA.servIce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: OA
 * @description: 用户管理业务层实现类
 * @author: bob
 * @create: 2021-01-30 10:26
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

}
