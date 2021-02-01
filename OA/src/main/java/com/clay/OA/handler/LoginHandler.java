package com.clay.OA.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: OA
 * @description: 登录拦截器
 * @author: bob
 * @create: 2021-01-29 16:37
 **/
public class LoginHandler implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private String password;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        logger.info("userName:" + username, "password" + password);
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {
        logger.info("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        logger.info("afterCompletion");
    }
}
