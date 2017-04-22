package com.alan.apigateway;

import com.alan.apigateway.oauth.AccessTokenEndpoint;
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
@ComponentScan(basePackages = {"com.alan.reader"})
public class AppZuulMain {

    public static void main(String[] args){
        SpringApplication.run(AppZuulMain.class, args);
    }

    @Bean
    public ServletRegistrationBean AuthorizeServlet(){
        return new ServletRegistrationBean(new AccessTokenEndpoint(), "/oauth_token/*");
    }
}
