package com;

import com.oauth.AccessTokenEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by alan on 16/12/26.
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class AppZuulMain {

    public static void main(String[] args){
        new SpringApplicationBuilder(AppZuulMain.class).run(args);
    }

    @Bean
    public ServletRegistrationBean AuthorizeServlet(){
        return new ServletRegistrationBean(new AccessTokenEndpoint(),"/oauth_token/*");
    }
}
