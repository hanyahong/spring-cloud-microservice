package com.hyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description : Eureka 服务发现server 启动类
 * @Author hanyahong
 * @Date 2017/12/4- 16:14
 */
@SpringBootApplication
@EnableEurekaServer
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}