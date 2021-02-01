package com.clay.OA.controller;

import com.clay.OA.entity.SingleResult;
import com.clay.OA.enums.CheckStatus;
import com.clay.OA.enums.HttpStatus;
import com.clay.OA.servIce.UserService;
import com.clay.OA.util.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: OA
 * @description: 测试controller
 * @author: bob
 * @create: 2021-01-29 14:30
 **/
@RestController
@RequestMapping(value = "/user")
@Api("用户管理")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUserInfo")
    @ApiOperation(value = "根据id查询商品", notes = "查询数据库中某个的商品信息")
    @ApiImplicitParams({@ApiImplicitParam(name = "userName", value = "用户姓名", paramType = "query", required = true, dataType = "String"), @ApiImplicitParam(name = "password", value = "密码", paramType = "query", required = true, dataType = "String")})
    public SingleResult getUserInfo(@RequestParam String userName, @RequestParam String password) {
        SingleResult singleResult = new SingleResult();
        if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
            singleResult.setCode(CheckStatus.userInfoEmpty.getCode());
            singleResult.setMessage(CheckStatus.userInfoEmpty.getMessage());
            return singleResult;
        }
        Map<String, String> userMap = new HashMap<>();
        userMap.put("userName", userName);
        userMap.put("password", MD5Utils.getMD5Password(password));
        singleResult.setCode(HttpStatus.SUCCESS.getCode());
        singleResult.setMessage(HttpStatus.SUCCESS.getMessage());
        singleResult.setData(userMap);
        return singleResult;
    }
}
