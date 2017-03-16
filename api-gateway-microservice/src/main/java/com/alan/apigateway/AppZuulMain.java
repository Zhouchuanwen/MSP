package com.alan.apigateway;

import com.alan.apigateway.oauth.AccessTokenEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by alan on 16/12/26.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.alan"})
public class AppZuulMain {

    @Autowired
    private AccessTokenEndpoint accessTokenEndpoint;

    public static void main(String[] args){
        SpringApplication.run(AppZuulMain.class, args);
    }

    @Bean
    public ServletRegistrationBean AuthorizeServlet(){
        return new ServletRegistrationBean(accessTokenEndpoint, "/oauth_token/*");
    }
}
