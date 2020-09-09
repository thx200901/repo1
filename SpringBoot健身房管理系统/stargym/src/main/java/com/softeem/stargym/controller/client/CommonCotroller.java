package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonCotroller {


    @RequestMapping("/toLogReg.hm")
    public String toLogReg(){
        return "client/logreg";
    }


    @RequestMapping("/toIndex.hm")
    public String toClientIndex(){
        return "client/index";
    }




}
