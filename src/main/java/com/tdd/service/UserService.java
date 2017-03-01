package com.tdd.service;

import com.tdd.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/26.
 */
public interface UserService {
    public User getUserById(String id);
    public void insertSelective(User user);
}
