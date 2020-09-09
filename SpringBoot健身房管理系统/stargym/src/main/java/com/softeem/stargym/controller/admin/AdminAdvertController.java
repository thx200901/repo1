package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Advert;
import com.softeem.stargym.service.AdvertService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminAdvertController {
    @Resource(name="advertService")
    AdvertService advertService;

    @RequestMapping("toAdvert.hm")
    public String toAdvert(Model model){
        List<Advert> advert = advertService.getAllAdvert();
        model.addAttribute("allAdvert",advert);
        return "admin/advert";
    }

    @RequestMapping("advertadd.hm")
    public String advertadd(){
        return "admin/advertadd";
    }

    @RequestMapping("loadAdvert.hm")
    public String loadAdvert(int id,Model model){
        Advert advert = advertService.getAdvert(id);
        model.addAttribute("advert",advert);
        return "admin/advertupdate";
    }

    @RequestMapping("updateAdvert.hm")
    public String updateAdvert(Advert advert){
        advertService.updateAdvert(advert);
        return "redirect:toAdvert.hm";
    }

    @RequestMapping("addAdvert.hm")
    public String addAdvert(Advert advert){
        advertService.addAdvert(advert);
        return  "redirect:toAdvert.hm";
    }

    @RequestMapping("deleteAdvert.hm")
    public String deleteAdvert(int id){
        advertService.deleteAdvert(id);
        return "redirect:toAdvert.hm";
    }

    @RequestMapping("selectAdvert")
    public String seleteAdvert(String name,Model model){
        List<Advert> advert = advertService.selectAdvertByName(name);
        model.addAttribute("allAdvert",advert);
        return "admin/advert";
    }

}
