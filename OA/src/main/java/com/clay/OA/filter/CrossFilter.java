package com.clay.OA.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: OA
 * @description: 跨域过滤器
 * @author: bob
 * @create: 2021-01-29 16:26
 **/
public class CrossFilter implements Filter {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info(" CrossFilter init ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        logger.info(" CrossFilter doFilter 请求");
        filterChain.doFilter(servletRequest,servletResponse);
        logger.info(" CrossFilter doFilter 相应");
    }

    @Override
    public void destroy() {
        logger.info(" CrossFilter destroy ");
    }
}
