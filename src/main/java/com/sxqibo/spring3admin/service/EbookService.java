package com.sxqibo.spring3admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sxqibo.spring3admin.domain.Ebook;
import com.sxqibo.spring3admin.domain.EbookExample;
import com.sxqibo.spring3admin.mapper.EbookMapper;
import com.sxqibo.spring3admin.req.EbookReq;
import com.sxqibo.spring3admin.resp.EbookResp;
import com.sxqibo.spring3admin.util.CopyUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class EbookService {
    
    private static final Logger LOG = LoggerFactory.getLogger(EbookService.class);

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();

        // 查询
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }

        // 起始页，每页数量
        PageHelper.startPage(1, 3);
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 获取总行数和总页数
        PageInfo<Ebook> pageInfo = new PageInfo<>(ebookList);
        LOG.info("总行数：{}", pageInfo.getTotal());
        LOG.info("总页数：{}", pageInfo.getPages());

        // 列表复制
        return CopyUtil.copyList(ebookList, EbookResp.class);
    }
}
