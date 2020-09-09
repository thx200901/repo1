package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 联系我们的控制器
 */
@Controller
public class ContactController {
    @RequestMapping("/toContact.hm")
    public String toContact(){
        return "client/contact";
    }
}
