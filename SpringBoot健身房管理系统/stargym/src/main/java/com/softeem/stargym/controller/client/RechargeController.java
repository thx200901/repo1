package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 充值功能先关的控制器
 */

@Controller
public class RechargeController {

    @RequestMapping("/toRecharge.hm")
    public String toRecharge(){
        return "client/recharge";
    }

}
