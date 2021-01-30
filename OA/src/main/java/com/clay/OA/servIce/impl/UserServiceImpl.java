package com.clay.OA.servIce.impl;

import com.clay.OA.mapper.UserMapper;
import com.clay.OA.servIce.UserService;

import javax.annotation.Resource;

/**
 * @program: OA
 * @description: 用户管理业务层实现类
 * @author: bob
 * @create: 2021-01-30 10:26
 **/
public class UserServiceImpl  implements UserService {

    @Resource
    private UserMapper userMapper;

}
