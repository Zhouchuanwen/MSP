package com.reader;

import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by alan on 16/12/26.
 */
@SpringBootApplication
@EnableDiscoveryClient
@ImportResource({ "/cxf.xml" })
public class ReaderAppMain {

    public static void main(String[] args){
        SpringApplication.run(ReaderAppMain.class, args);
    }

    @Bean
    public ServletRegistrationBean cxfServlet() {
        CXFServlet cxfServlet = new CXFServlet();
        ServletRegistrationBean servletDef = new ServletRegistrationBean(cxfServlet, "/services/*");
        servletDef.setLoadOnStartup(1);
        return servletDef;
    }
}
