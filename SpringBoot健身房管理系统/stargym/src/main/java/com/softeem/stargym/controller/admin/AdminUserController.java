package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.User;
import com.softeem.stargym.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminUserController {
    @Resource(name="userService")
    UserService userService;

    @RequestMapping("toUser.hm")
    public String toUser(Model model){
        List<User> user = userService.getAllUser();
        model.addAttribute("allUser",user);
        return "admin/user";
    }

    @RequestMapping("loadUser.hm")
    public String loadUser(int id,Model model){
        User user = userService.getUser(id);
        model.addAttribute("user",user);
        return "admin/userupdate";
    }

    @RequestMapping("updateUser.hm")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:toUser.hm";
    }

    @RequestMapping("addUser.hm")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:toUser.hm";
    }

    @RequestMapping("deleteUser.hm")
    public String deleteUser(int id){
        userService.deleteUser(id);
        return "redirect:toUser.hm";
    }

    @RequestMapping("selectUser")
    public String selectUser(String name,Model model){
        List<User> user = userService.selectUserByName(name);
        model.addAttribute("allUser",user);
        return "admin/user";
    }

}
