package com.single.onlineexamsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 项目构建测试
 *
 * @author: 1999single
 * @date: 2020/9/12 9:43
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @GetMapping("/build")
    public String build() {
        return "index";
    }
}
