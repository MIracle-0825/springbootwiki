package com.ding.springbootwiki.service;

import com.ding.springbootwiki.domain.Ebook;
import com.ding.springbootwiki.domain.EbookExample;
import com.ding.springbootwiki.mapper.EbookMapper;
import org.junit.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;
    public List<Ebook> list(String name){
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+name+"%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
