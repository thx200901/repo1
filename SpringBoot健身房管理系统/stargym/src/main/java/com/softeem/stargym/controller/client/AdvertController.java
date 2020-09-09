package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  广告相关的控制器
 */

@Controller
public class AdvertController {

    @RequestMapping("/toAdvert.hm")
    public String toAdvert(){
        return "client/advert";
    }

}
