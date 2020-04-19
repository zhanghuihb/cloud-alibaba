package com.burton.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 大瞳小沐
 * Date: 2020/4/19
 * Time: 21:19
 */
@RestController
public class TestController {

    @GetMapping(value = "/echo/{str}")
    public String echo(@PathVariable("str") String echo){
        return "HELLO " + echo;
    }
}
