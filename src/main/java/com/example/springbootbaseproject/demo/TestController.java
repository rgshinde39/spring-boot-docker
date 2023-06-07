package com.example.springbootbaseproject.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/test")
    public String test() {
        String appName = jdbcTemplate.queryForObject("select name from appname", String.class);
        return appName+" working fine";
    }
}
