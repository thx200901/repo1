package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 意见相关功能的控制器
 */

@Controller
public class SuggestionController {

    @RequestMapping("/toSuggestion.hm")
    public  String toSuggestion(){
        return  "client/suggestion";
    }

}
