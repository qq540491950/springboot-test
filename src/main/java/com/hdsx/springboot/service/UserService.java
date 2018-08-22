package com.hdsx.springboot.service;

import com.hdsx.springboot.entity.User;

import java.util.List;

/**
 * @author lirt
 */
public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> user();

    /**
     * 通过id获取用户信息
     * @param id
     * @return
     */
    User getUser(String id);
}
