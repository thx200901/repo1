package com.softeem.stargym.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *  健身项目相关功能的控制器
 */

@Controller
public class ProjectController {

    @RequestMapping("/toProject.hm")
    public String toProject(){ return "client/project";}
}
