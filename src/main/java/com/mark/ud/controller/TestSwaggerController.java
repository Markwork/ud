package com.mark.ud.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/swaggertest")
public class TestSwaggerController {
    @ApiOperation(value="测试swagger", notes="测试swagger")
    @RequestMapping(value = "test",method= RequestMethod.GET)
    public String getTest(){
        return "this swagger test!";
    }
}
