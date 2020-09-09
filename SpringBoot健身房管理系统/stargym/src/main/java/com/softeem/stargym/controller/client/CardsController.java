package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 课程控制器
 */
@Controller
public class CardsController {

    @RequestMapping("/toCards.hm")
    public String toCards(){
        return "client/cards";
    }




}
