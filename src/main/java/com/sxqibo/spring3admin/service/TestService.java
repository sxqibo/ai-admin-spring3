package com.sxqibo.spring3admin.service;

import com.sxqibo.spring3admin.domain.Test;
import com.sxqibo.spring3admin.mapper.TestMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
