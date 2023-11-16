package com.sxqibo.spring3admin.controller;

import com.sxqibo.spring3admin.domain.Ebook;
import com.sxqibo.spring3admin.req.EbookReq;
import com.sxqibo.spring3admin.resp.CommonResp;
import com.sxqibo.spring3admin.resp.EbookResp;
import com.sxqibo.spring3admin.service.EbookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }

}
