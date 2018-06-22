package com.mark.ud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@ApiIgnore
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "Hello Spring boot";
    }
}
