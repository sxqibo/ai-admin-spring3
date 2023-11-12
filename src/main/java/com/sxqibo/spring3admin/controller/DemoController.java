package com.sxqibo.spring3admin.controller;

import com.sxqibo.spring3admin.domain.Demo1;
import com.sxqibo.spring3admin.service.Demo1Service;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class DemoController {

    @Resource
    private Demo1Service demo1Service;

    @GetMapping("/list")
    public List<Demo1> list() {
        return demo1Service.list();
    }

}
