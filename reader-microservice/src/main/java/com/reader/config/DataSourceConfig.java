package com.reader.config;

import com.mongodb.MongoClient;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


/**
 * Created by alan on 17/1/3.
 */

@Service
@Configuration
@EnableTransactionManagement
public class DataSourceConfig {

    //mysql 配置
    @Value("${datasource.mysql?:127.0.0.1:3306/reader}")
    private String mysql;

    @Value("${datasource.driver?:com.mysql.jdbc.Driver}")
    private String classDriver;

    @Value("${datasource.username?:root}")
    private String mysqlUserName;

    //mongodb 配置
    @Value("${datasource.mongodb?:127.0.0.1:27017}")
    private String mongodb;

    @Value("${datasource.db?:book}")
    private String db;

    @Bean
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(classDriver);
        dataSource.setUrl(mysql);
        dataSource.setUsername(mysqlUserName);
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean(autowire= Autowire.BY_NAME,name = "jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() throws Exception{
        return new JdbcTemplate(dataSource());
    }

    @Bean(autowire= Autowire.BY_NAME,name = "mongoTemplate")
    public MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(new SimpleMongoDbFactory(new MongoClient(mongodb),db));
    }

}
