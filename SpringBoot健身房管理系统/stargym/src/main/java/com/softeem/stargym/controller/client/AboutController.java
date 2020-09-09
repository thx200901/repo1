package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 关于我们 功能控制器
 */
@Controller
public class AboutController {

    @RequestMapping("/toAbout.hm")
    public String toAbout(){
        return "client/about";
    }
}
