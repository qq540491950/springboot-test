package com.hdsx.springboot.service.serviceimpl;

import com.hdsx.springboot.entity.User;
import com.hdsx.springboot.mapper.UserMapper;
import com.hdsx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lirt
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> user() {
        return userMapper.user();
    }
}
