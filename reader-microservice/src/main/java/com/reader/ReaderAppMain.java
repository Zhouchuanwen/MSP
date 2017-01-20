package com.reader;

import com.reader.impl.ReaderRestServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

/**
 * Created by alan on 16/12/26.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReaderAppMain {

    @Autowired
    private Bus bus;


    public static void main(String[] args){
        SpringApplication.run(ReaderAppMain.class, args);
    }

    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setServiceBean(new ReaderRestServiceImpl());
        endpoint.setFeatures(Arrays.asList(new LoggingFeature()));
        return endpoint.create();
    }
}
