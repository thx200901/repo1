package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 教练相关功能的控制器
 */
@Controller
public class CoachesController {

    @RequestMapping("/toCoaches.hm")
    public String toCoaches(){
        return "client/coaches";
    }
}
