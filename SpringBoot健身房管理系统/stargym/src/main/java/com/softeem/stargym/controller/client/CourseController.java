package com.softeem.stargym.controller.client;

/*
 * 课程相关功能的控制器
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {

    @RequestMapping("/toCourse.hm")
    public String toCourse(){
        return "client/course";
    }
}
