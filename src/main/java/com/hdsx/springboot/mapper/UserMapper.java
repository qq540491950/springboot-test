package com.hdsx.springboot.mapper;

import com.hdsx.springboot.entity.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

/**
 * @author lirt
 */
@Mapper
public interface UserMapper {

    List<User> user();
}
