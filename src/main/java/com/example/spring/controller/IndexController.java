package com.example.spring.controller;

import com.example.spring.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ author yangwenguang
 * @ date 2022/1/12
 */
@RestController
public class IndexController {

    @Autowired
    AccountMapper accountMapper;

    @GetMapping("/get")
    public String getMapping() {
        accountMapper.saveAccount();

        return "Index";
    }
}
