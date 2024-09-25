package com.free.springebean.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 17:41
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/", "/index", ""})
    public String index() {
        return "index";
    }
}
