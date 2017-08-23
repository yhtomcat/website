package com.benxiaohai.service.impl;

import com.benxiaohai.dao.WebsiteMapper;
import com.benxiaohai.domain.Website;
import com.benxiaohai.service.WebsiteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2017/8/23.
 */
@Service
public class WebsiteServiceImpl implements WebsiteService{
    @Resource
    private WebsiteMapper websiteMapper;
    @Override
    public List<Website> findAllwebsite() {
        List<Website> websites = websiteMapper.selectAllWebsite();
        return websites;
    }
}
