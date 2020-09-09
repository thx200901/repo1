package com.softeem.stargym.controller.admin;


import com.softeem.stargym.entity.Coaches;
import com.softeem.stargym.service.CoacheService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminCoachesController {
    @Resource(name="coachesService")
    CoacheService coacheService;

    @RequestMapping("toCoaches.hm")
    public String toCoaches(Model model){
        List<Coaches> coaches = coacheService.getAllCoaches();
        model.addAttribute("allCoaches",coaches);
        return "admin/topic";
    }

    @RequestMapping("topicadd.hm")
    public String topicadd(){
        return "admin/topicadd";
    }

    @RequestMapping("loadCoaches.hm")
    public String loadCoach(int id,Model model){
        Coaches coaches = coacheService.getCoaches(id);
        model.addAttribute("coaches",coaches);
        return "admin/topicupdate";
    }

    @RequestMapping("updateCoaches.hm")
    public String updateCoaches(Coaches coaches ){
        coacheService.updateCoaches(coaches);
        return "redirect:toCoaches.hm";
    }

    @RequestMapping("addCoaches.hm")
    public String addCoaches(Coaches coaches){
        coacheService.addCoaches(coaches);
        return "redirect:toCoaches.hm";
    }

    @RequestMapping("deleteCoaches.hm")
    public String deleteCoaches(int id){
        coacheService.deleteCoaches(id);
        return "redirect:toCoaches.hm";
    }

    @RequestMapping("selectCoaches")
    public String selectCoaches(String name,Model model){
        List<Coaches> coaches = coacheService.selectCoachesByName(name);
        model.addAttribute("allCoaches",coaches);
        return "admin/topic";
    }
}
