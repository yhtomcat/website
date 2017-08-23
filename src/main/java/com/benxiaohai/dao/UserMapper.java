package com.benxiaohai.dao;

import com.benxiaohai.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2017/8/17.
 */
@MapperScan
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
