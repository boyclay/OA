package com.clay.OA.config;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: OA
 * @description: swagger 配置类
 * @author: bob
 * @create: 2021-01-29 09:28/
 **/

@Configuration
@EnableSwagger2
//@Profile({"dev","test"})
@ConditionalOnProperty(prefix = "swagger",value = {"enable"},havingValue = "true")
//@Value() 通过设置enable
public class SwaggerConfig {

    /**
    * @Description: swaager 初始化
    * @Param: []
    * @return: springfox.documentation.spring.web.plugins.Docket
    * @Author: bob
    * @Date: 2021/1/29
    */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.clay.OA.controller")).paths(PathSelectors.any())
                .build();
    }

   /**
   * @Description: 
   * @Param: []
   * @return: springfox.documentation.service.ApiInfo
   * @Author: bob
   * @Date: 2021/1/29
   */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 页面标题
                .title("OA Swagger2 构建RESTful API")
                // 创建人信息
                .contact(new Contact("bob",  "http://localhost:8077/swagger-ui.html",  "2628894322@qq.com"))
                // 版本号
                .version("1.0")
                // 描述
                .description("API 描述")
                .build();
    }
}
