package com.softeem.stargym.controller.admin;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.softeem.stargym.entity.Admin;
import com.softeem.stargym.entity.Role;
import com.softeem.stargym.service.AdminService;
import com.softeem.stargym.util.App;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Resource(name="adminService")
    AdminService adminService;

    @Resource
    private DefaultKaptcha captchaProducer;

    /**
     * 登录验证码SessionKey
     */
    public static final String LOGIN_VALIDATE_CODE = "login_validate_code";
    /**
     * 登录验证码图片
     */
    @RequestMapping(value = {"/createCode.hm"})
    public void loginValidateCode(HttpServletRequest request, HttpServletResponse response) throws Exception{
        App.validateCode(request,response,captchaProducer,LOGIN_VALIDATE_CODE);
    }

    /**
     * 检查验证码
     * @param code
     * @param session
     * @return
     */
    @RequestMapping("/checkCode.hm")
    @ResponseBody
    public boolean checkCode(String code,HttpSession session){
        String sessionCode =(String) session.getAttribute(LOGIN_VALIDATE_CODE);
        System.out.println(sessionCode+","+code);
        if(sessionCode.equalsIgnoreCase(code)){
            System.out.println("1111");
            return true;
        }
        return false;
    }

    /**
     * 处理登录请求
     * @param admin
     * @param model
     * @param request
     * @return
     */
    @RequestMapping("doLogin.hm")
    public String login(Admin admin, Model model, HttpServletRequest request){
        int result = adminService.loginAdmin(admin,request.getSession());
        if (result== App.ACCOUNT_EEROR){
            model.addAttribute("msg","账号不存在");
            return "admin/log";
        }else if (result==App.PASSWORD_ERROR){
            model.addAttribute("msg","密码错误");
            return "admin/log";
        }
        return "redirect:toIndex.hm";
    }


    /**
     * 查询所有的管理员
     * @param model
     * @return
     */
    @RequestMapping("showAdmin.hm")
    public String showAdmin(Model model){
        List<Admin> admins = adminService.showAllAdmins();
        model.addAttribute("admins",admins);
        return "admin/admin";
    }


    @RequestMapping("selectRoleType.hm")
    @ResponseBody
    public List<Role> showRoles(){
        List<Role> roles = adminService.getAllRoles();
        return roles;
    }


    @RequestMapping("loadAdmin.hm")
    @ResponseBody
    public Admin loadAdmin(int id){
        Admin admin = adminService.loadAdmin(id);
        return admin;
    }

    @RequestMapping("updateAdmin.hm")
    public String updateAdmin(Admin admin){
        adminService.updateAdmin(admin);
        return "redirect:showAdmin.hm";
    }

    @RequestMapping("deleteAdmin.hm")
    public String deleteAdmin(int id){
        adminService.deleteAdmin(id);
        return "redirect:showAdmin.hm";
    }

    @RequestMapping("addAdmin.hm")
    public String addAdmin(Admin admin){
        adminService.saveAdmin(admin);
        return "redirect:showAdmin.hm";
    }

}
