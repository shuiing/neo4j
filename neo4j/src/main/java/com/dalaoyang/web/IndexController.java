package com.dalaoyang.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    // 所有数据为动态数据
    @GetMapping("/neo")
    public String neo() {
        return "neo";
    }
}
