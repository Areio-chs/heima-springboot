package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

//@Configuration
//@PropertySource("classpath:jdbc.properties")
//@EnableConfigurationProperties(JdbcProperties.class)
/*最终配置了连接池，不需要这个配置datasource的bean了，在HelloController可以直接拿到datasource*/
public class JdbcConfig {
//    @Value("${jdbc.url}")
//    String url;
//    @Value("${jdbc.driverClassName}")
//    String driverClassName;
//    @Value("${jdbc.username}")
//    String username;
//    @Value("${jdbc.password}")
//    String password;
//
//    @Bean
//    public DataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
    /*JdbcProperties已经从属性文件取的值了，成为一个配置对象，在这可以直接拿值了*/
//        @Bean
//        public DataSource dataSource(JdbcProperties jdbcProperties) {
//            DruidDataSource dataSource = new DruidDataSource();
//            dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
//            dataSource.setUrl(jdbcProperties.getUrl());
//            dataSource.setUsername(jdbcProperties.getUsername());
//            dataSource.setPassword(jdbcProperties.getPassword());
//            return dataSource;
//        }
}
