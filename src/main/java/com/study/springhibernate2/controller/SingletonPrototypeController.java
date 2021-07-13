package com.study.springhibernate2.controller;

import com.study.springhibernate2.service.SingletonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SingletonPrototypeController {

    @Autowired
    private SingletonService singletonService;

    @GetMapping("/v1/example")
    public List<String> getTime() throws InterruptedException {
        String first = singletonService.getTime();
        Thread.sleep(2000);
        String second = singletonService.getTime();
        return Arrays.asList(first, second);
    }
}
