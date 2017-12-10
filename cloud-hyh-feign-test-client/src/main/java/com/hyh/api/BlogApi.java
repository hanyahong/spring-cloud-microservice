package com.hyh.api;

import com.hyh.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description :博客操作API，对外暴露
 * @Author hanyahong
 * @Date 2017/12/10- 12:53
 */
@RestController
@RequestMapping(value = "/feign")
public class BlogApi {
    /**
     * 注入服务层接口
     */
    @Autowired
    TestService testService;


    /**
     * 通过Feign客户端的方式，调用之前一个服务的API
     *
     * @return
     */
    @RequestMapping("/blogName")
    public String getBlogNameByFeign() {
        return "通过feign方式得到：" + testService.getBlogName();
    }
}
