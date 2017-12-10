package com.hyh.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description :测试feign接口服务
 * @Author hanyahong
 * @Date 2017/12/10- 12:43
 * <p>
 * 通过在本服务的service层直接调用其他服务的api层的API接口进行相关操作。
 * cloud-service 是一个简单服务，测试返回一个获取博客名称的接口。
 */

@FeignClient("cloud-service")
public interface TestService {

    /**
     * 调取博客名称
     *
     * @return 博客名称
     */
    @GetMapping("/ribbon/name")
    String getBlogName();
}
