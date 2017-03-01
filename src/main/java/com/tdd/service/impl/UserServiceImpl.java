package com.tdd.service.impl;

import com.tdd.dao.UserMapper;
import com.tdd.model.User;
import com.tdd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/2/26.
 */
@Service
public class UserServiceImpl implements UserService{


    private UserMapper userMapper;

    public User getUserById(String userId) {
        Integer id = Integer.valueOf(userId);
        return userMapper.selectByPrimaryKey(id);
    }
    public void insertSelective(User user){
        userMapper.insertSelective(user);
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

}
