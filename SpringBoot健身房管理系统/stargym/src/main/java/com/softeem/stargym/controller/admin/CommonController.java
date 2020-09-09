package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CommonController {
    @RequestMapping("admin/toIndex.hm")
    public String toIndex(HttpSession session){
//        Admin admin = (Admin)session.getAttribute("loginAdmin");
//        if (admin==null){
//            return "admin/log";
//        }
        return "admin/index";
    }
    @RequestMapping("admin/toLogin.hm")
    public String toLog(){
        return "admin/log";
    }

    @RequestMapping("admin/toLeft.hm")
    public String toLeft(){
        return "admin/inc/left";
    }

    @RequestMapping("admin/toHead.hm")
    public String toHead(){
        return "admin/inc/head";
    }

    @RequestMapping("admin/toFoot.hm")
    public String toFoot(){
        return "admin/inc/foot";
    }

    @RequestMapping("admin/toMain.hm")
    public String toMain(){
        return "admin/main";
    }


    @RequestMapping("admin/toBanner.hm")
    public String toBanner(){
        return "admin/banner";
    }



}
