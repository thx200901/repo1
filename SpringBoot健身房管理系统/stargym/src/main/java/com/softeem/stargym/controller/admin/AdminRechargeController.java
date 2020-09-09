package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Recharge;
import com.softeem.stargym.service.RechargeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminRechargeController {
    @Resource(name="rechargeService")
    RechargeService rechargeService;

    @RequestMapping("toRecharge.hm")
    public String toRecharge(Model model){
        List<Recharge> recharge = rechargeService.getAllRecharge();
        model.addAttribute("allRecharge",recharge);
        return "admin/recharge";
    }

    @RequestMapping("rechargeadd.hm")
    public String rechargeadd(){
        return "admin/rechargeadd";
    }

    @RequestMapping("loadRecharge.hm")
    public String loadRecharge(int id,Model model){
        Recharge recharge  =rechargeService.getRecharge(id);
        model.addAttribute("recharge",recharge);
        return "admin/rechargeupdate";
    }

    @RequestMapping("updateRecharge.hm")
    public String updateRecharge(Recharge recharge){
        rechargeService.updateRecharge(recharge);
        return "redirect:toRecharge.hm";
    }

    @RequestMapping("addRecharge.hm")
    public String addRecharge(Recharge recharge){
        rechargeService.addRecharge(recharge);
        return "redirect:toRecharge.hm";
    }

    @RequestMapping("deleteRecharge.hm")
    public String deleteRecharge(int id){
        rechargeService.deleteRecharge(id);
        return "redirect:toRecharge.hm";
    }

    @RequestMapping("selectRecharge")
    public String selectRecharge(String name,Model model){
        List<Recharge> recharge = rechargeService.selectRechargeByName(name);
        model.addAttribute("allRecharge",recharge);
        return  "admin/recharge";
    }

}
