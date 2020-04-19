package com.burton.cloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 大瞳小沐
 * Date: 2020/4/19
 * Time: 21:19
 */
@RestController
@RequestMapping("/provider")
public class TestController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String echo){
        return "HELLO " + echo;
    }

    @GetMapping(value = "/port")
    public String port(){
        return "hello provider service post is " + port;
    }
}
