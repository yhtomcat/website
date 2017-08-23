package com.benxiaohai.dao;

import com.benxiaohai.domain.Website;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lenovo on 2017/8/23.
 */
@MapperScan
@Repository
public interface WebsiteMapper {
    List<Website> selectAllWebsite();
}
