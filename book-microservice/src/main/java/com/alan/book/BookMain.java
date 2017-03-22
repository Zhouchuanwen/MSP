package com.alan.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by alan on 17/3/4.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BookMain {

    public static void main(String[] args) {
        SpringApplication.run(BookMain.class, args);
    }

}
