package com.hdsx.springboot.utils;

import com.hdsx.springboot.entity.Result;

/**
 * @author lirt
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(1);
        result.setMessage("请求成功");
        result.setData(object);
        return result;
    }
    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String resultmsg){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(resultmsg);
        return result;
    }

}
