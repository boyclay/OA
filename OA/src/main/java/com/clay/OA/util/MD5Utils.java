package com.clay.OA.util;

import org.springframework.util.DigestUtils;

/**
 * @program: OA
 * @description: 通过MD5算法密码加密
 * @author: bob
 * @create: 2021-01-29 12:52
 **/
public class MD5Utils {
    /*
         DigestUtils通用的有两种  一个spring自带的不需要引用其他的jar  另一个是apaceh commons-codec 加密工具类 DigestUtils 功能应该一样,但是需要额外的配置
     */

    // 默认盐
    private static final String salt = "clayclay";

    /**
    * @Description: MD5加密
    * @Param: [src]
    * @return: java.lang.String
    * @Author: bob
    * @Date: 2021/1/29
    */
    public static String md5(String password) {
        return DigestUtils.md5DigestAsHex (password.getBytes());
    }

    /**
    * @Description: 对穿入的代码先加盐在MD5加密
    * @Param: [inputPass]
    * @return: java.lang.String
    * @Author: bob
    * @Date: 2021/1/29
    */
    public static String getMD5Password(String password) {
        String str = salt.charAt(0)+salt.charAt(2) + password +salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }
}
