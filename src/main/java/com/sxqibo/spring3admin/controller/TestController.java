package com.sxqibo.spring3admin.controller;

import com.sxqibo.spring3admin.domain.Test;
import com.sxqibo.spring3admin.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

    @GetMapping ("/api/hello")
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/api/hello/post")
    public String helloPost(String name) {
        return "Hello World!Post," + name;
    }

    @GetMapping("/api/test/list")
    public List<Test> list() {
        return testService.list();
    }

}
