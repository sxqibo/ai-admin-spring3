package com.sxqibo.spring3admin.service;

import com.sxqibo.spring3admin.domain.Ebook;
import com.sxqibo.spring3admin.domain.EbookExample;
import com.sxqibo.spring3admin.mapper.EbookMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(String name) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + name +"%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
