package com.hdsx.springboot.controller;

import com.hdsx.springboot.entity.Result;
import com.hdsx.springboot.entity.User;
import com.hdsx.springboot.service.UserService;
import com.hdsx.springboot.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lirt
 * 测试控制器
 */
@CrossOrigin
@RestController
@RequestMapping(value = "hello")
@Api(description = "测试类")
public class HelloController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "index")
    @ApiOperation(value = "测试首页")
    public Result index(@ModelAttribute User user ){
        return ResultUtil.success(user);
    }

    @GetMapping(value = "user")
    @ApiOperation(value = "获取所有用户")
    public Result user(){
        return ResultUtil.success(userService.user());
    }

    @GetMapping(value = "getUser")
    @ApiOperation(value = "通过ID获取用户")
    public Result getUser(@ApiParam(name = "id", value = "用户id") @RequestParam(value = "id", required = true)String id){
        return ResultUtil.success(userService.getUser(id));
    }
}
