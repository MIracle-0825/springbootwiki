package com.ding.springbootwiki.controller;

import com.ding.springbootwiki.domain.Ebook;
import com.ding.springbootwiki.mapper.EbookMapper;
import com.ding.springbootwiki.resp.CommonResp;
import com.ding.springbootwiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;
    @GetMapping("/list/{name}")
    public CommonResp list(@PathVariable("name") String name){
        CommonResp<List<Ebook>> resp = new CommonResp<>();
        List<Ebook> list = ebookService.list(name);
        resp.setContent(list);
        return resp;
    }
}
