package com.hdsx.springboot.mapper;

import com.hdsx.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author lirt
 */
@Mapper
public interface UserMapper {

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
