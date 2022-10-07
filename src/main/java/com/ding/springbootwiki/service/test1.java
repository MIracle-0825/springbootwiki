package com.ding.springbootwiki.service;

import com.ding.springbootwiki.domain.Ebook;
import com.ding.springbootwiki.mapper.EbookMapper;
import org.junit.Test;

import javax.annotation.Resource;

public class test1 {
    @Resource
    private EbookMapper ebookMapper;
    @Test
    public void test(){
        ebookMapper.insert(new Ebook(100L));
    }
}
