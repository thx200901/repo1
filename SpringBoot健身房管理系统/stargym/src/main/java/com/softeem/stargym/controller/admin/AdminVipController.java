package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Vip;
import com.softeem.stargym.service.VipService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminVipController {
    @Resource(name="vipService")
    VipService vipService;

    @RequestMapping("toVip.hm")
    public String toVip(Model model){
        List<Vip> vip = vipService.getAllVip();
        model.addAttribute("allVip",vip);
        return "admin/vip";
    }

    @RequestMapping("vipadd.hm")
    public String tovipadd(){
        return "admin/vipadd";
    }

    @RequestMapping("loadVip.hm")
    public String loadVip(int id,Model model){
        Vip vip = vipService.getVip(id);
        model.addAttribute("vip",vip);
        return "admin/tovipupdate";
    }

    @RequestMapping("updateVip.hm")
    public String updateVip(Vip vip){
        vipService.updateVip(vip);
        return "redirect:toVip.hm";
    }

    @RequestMapping("addVip.hm")
    public String addVip(Vip vip){
        vipService.addVip(vip);
        return "redirect:toVip.hm";
    }

    @RequestMapping("deleteVip.hm")
    public String deleteVip(int id){
        vipService.deleteVip(id);
        return "redirect:toVip.hm";
    }

    @RequestMapping("selectVip")
    public String selectVip(String name, Model model){
        List<Vip> vip = vipService.selectVipByName(name);
        model.addAttribute("allVip",vip);
        return "admin/vip";
    }

}
