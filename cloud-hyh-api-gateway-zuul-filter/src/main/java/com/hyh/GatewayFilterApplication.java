package com.hyh;

import com.hyh.config.AccessTokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2017/12/17.
 * 网关启动入口
 */
@SpringBootApplication
@EnableZuulProxy
public class GatewayFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayFilterApplication.class, args);
    }
    /**
     * 加载过滤器
     * @return
     */
    @Bean
    public AccessTokenFilter accessFilter() {
        return new AccessTokenFilter();
    }
}