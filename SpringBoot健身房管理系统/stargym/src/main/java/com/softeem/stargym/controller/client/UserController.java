package com.softeem.stargym.controller.client;

import com.softeem.stargym.service.UserService;
import com.softeem.stargym.util.App;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource(name="userService")
    UserService userService;

    @RequestMapping("/doLogin.hm")
    public String doLogin(String account, String password, Model model){
        int result =  userService.loginUser(account,password);
        if(result== App.LOGIN_OK){
            return "redirect:toIndex.hm";
        }else if(result==App.ACCOUNT_EEROR){
            model.addAttribute("msg","账号不存在");
        }else{
            model.addAttribute("msg","密码错误");
        }
        return "client/logreg";
    }
}
