package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 会员相关功能的控制器
 */
@Controller
public class VipController {


    @RequestMapping("/toVip.hm")
    public String toVip(){
        return "client/vip";
    }
}
