package com.sxqibo.spring3admin.service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.sxqibo.spring3admin.domain.Ebook;
import com.sxqibo.spring3admin.domain.EbookExample;
import com.sxqibo.spring3admin.mapper.EbookMapper;
import com.sxqibo.spring3admin.req.EbookReq;
import com.sxqibo.spring3admin.resp.EbookResp;
import com.sxqibo.spring3admin.util.CopyUtil;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        // 查询
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 列表复制
        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
