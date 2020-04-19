package com.burton.cloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Author: 大瞳小沐
 * Date: 2020/4/19
 * Time: 22:29
 */
@FeignClient(name = "service-provider")
public interface TestFeignService {

    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);

    @GetMapping(value = "/provider/port")
    String port();
}
