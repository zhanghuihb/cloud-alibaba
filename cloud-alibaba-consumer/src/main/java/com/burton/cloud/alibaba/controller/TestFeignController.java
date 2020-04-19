package com.burton.cloud.alibaba.controller;

import com.burton.cloud.alibaba.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 大瞳小沐
 * Date: 2020/4/19
 * Time: 22:13
 */
@RestController
@RequestMapping("/consumer")
public class TestFeignController {

    @Autowired
    private TestFeignService testFeignService;

    @GetMapping("/echo/{str}")
    public String echo(@PathVariable("str") String str){
        return testFeignService.echo(str);
    }

    @GetMapping("/port")
    public String port(){
        return testFeignService.port();
    }

}
