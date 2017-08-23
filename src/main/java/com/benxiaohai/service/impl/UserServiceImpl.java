package com.benxiaohai.service.impl;

import com.benxiaohai.dao.UserMapper;
import com.benxiaohai.domain.User;
import com.benxiaohai.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 不加Service注解，启动报错，无法将Serivice注入
 * Created by lenovo on 2017/8/18.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public String findUser(User user) {
        User dbuser = userMapper.selectUserByName(user.getUsername());
        if(user.getPassword().equals(dbuser.getPassword())){
            return "success";
        }
        return "error";
    }
}
