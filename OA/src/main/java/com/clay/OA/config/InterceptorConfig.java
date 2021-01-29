package com.clay.OA.config;

import com.clay.OA.handler.LoginHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: OA
 * @description: 拦截器配置
 * @author: bob
 * @create: 2021-01-29 16:42
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    
    /**
    * @Description: 注册自定义拦截器
    * @Param: [registry]
    * @return: void
    * @Author: bob
    * @Date: 2021/1/29
    */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandler()).addPathPatterns("/user/getUserInfo");
    }
}
