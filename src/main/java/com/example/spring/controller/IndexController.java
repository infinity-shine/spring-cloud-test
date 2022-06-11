package com.example.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author yangwenguang
 * @ date 2022/1/12
 */
@RestController
public class IndexController {

    @GetMapping("/get")
    public String getMapping() {
        return "Index";
    }
}
