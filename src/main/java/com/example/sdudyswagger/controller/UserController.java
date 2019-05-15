package com.example.sdudyswagger.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @ApiOperation(value = "获取用户列表", notes = "查询用户列表")
    @ApiResponses({
            @ApiResponse(code = 100, message = "异常数据")
    })
    @RequestMapping("/test")
    private String getStr(){
        return "1111111111";

    }
}
