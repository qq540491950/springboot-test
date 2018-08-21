package com.hdsx.springboot.entity;

import io.swagger.annotations.ApiModel;

import java.io.Serializable;

/**
 * @author lirt
 */
@ApiModel(value = "User", description = "用户对象")
public class User implements Serializable {

    private static final long serialVersionUID = -5954479302837582792L;

    private String id;
    private String username;
    private String password;
    private String nickname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

}
