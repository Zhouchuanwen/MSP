package com.alan.apigateway;

import com.alan.apigateway.oauth.AccessTokenEndpoint;
import com.alan.reader.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Created by alan on 16/12/26.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.alan.reader"})
public class AppZuulMain {

    private static ApplicationContext context;

    private static UserService userService;

    public static void main(String[] args){
        userService = new SpringApplicationBuilder(AppZuulMain.class).run(args).getBean(UserService.class);
        userService.sayHi();
    }

    @Bean
    public ServletRegistrationBean AuthorizeServlet(){
        return new ServletRegistrationBean(new AccessTokenEndpoint(),"/oauth_token/*");
    }
}
