package com.clay.OA.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: OA
 * @description: 认证过滤器
 * @author: bob
 * @create: 2021-01-29 16:23
 **/
public class AuthorityFilter implements Filter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(" AuthorityFilter init ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(" AuthorityFilter doFilter 请求");
        filterChain.doFilter(servletRequest, servletResponse);
        logger.info(" AuthorityFilter doFilter 相应");
    }

    @Override
    public void destroy() {
        logger.info(" AuthorityFilter destroy ");
    }
}
