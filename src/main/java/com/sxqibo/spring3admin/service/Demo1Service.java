package com.sxqibo.spring3admin.service;

import com.sxqibo.spring3admin.domain.Demo1;
import com.sxqibo.spring3admin.mapper.Demo1Mapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Demo1Service {

    @Resource
    private Demo1Mapper demo1Mapper;

    public List<Demo1> list() {
        return demo1Mapper.selectByExample(null);
    }
}
