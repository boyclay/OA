package com.clay.OA.config;

import com.clay.OA.filter.AuthorityFilter;
import com.clay.OA.filter.CrossFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: OA
 * @description: 过滤器配置
 * @author: bob
 * @create: 2021-01-29 16:28
 **/
@Configuration
public class FilterConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

   /**
   * @Description: 注册 AuthorityFilter 过滤器
   * @Param: []
   * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
   * @Author: bob
   * @Date: 2021/1/29
   */
    @Bean
    public FilterRegistrationBean authorityFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new AuthorityFilter());
        filterRegistrationBean.setOrder(1);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }

    /**
     * @Description: 注册 CrossFilter 过滤器
     * @Param: []
     * @return: org.springframework.boot.web.servlet.FilterRegistrationBean
     * @Author: bob
     * @Date: 2021/1/29
     */
    @Bean
    public FilterRegistrationBean crossFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new CrossFilter());
        filterRegistrationBean.setOrder(0);
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
