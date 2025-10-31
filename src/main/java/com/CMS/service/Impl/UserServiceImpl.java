package com.CMS.service.Impl;

import com.CMS.entity.User;
import com.CMS.mapper.UserMapper;
import com.CMS.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void add(User user) {
        userMapper.insert(user);
    }
}
