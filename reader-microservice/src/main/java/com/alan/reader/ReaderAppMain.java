package com.alan.reader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by alan on 16/12/26.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ReaderAppMain{

    public static void main(String[] args){
        SpringApplication.run(ReaderAppMain.class, args);
    }

}
