package com.softeem.stargym.service;

import com.softeem.stargym.entity.Admin;
import com.softeem.stargym.entity.Role;
import com.softeem.stargym.mapper.AdminMapper;
import com.softeem.stargym.mapper.RoleMapper;
import com.softeem.stargym.util.App;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.List;

@Service("adminService")
public class AdminService {
    @Resource
    AdminMapper mapper;
    @Resource
    RoleMapper roleMapper;


    /**
     * 处理管理员的登录业务
     * @param admin
     * @param session
     * @return
     */
    public int loginAdmin(Admin admin, HttpSession session) {
        Admin findAdmin = mapper.findAdminByUsername(admin.getUsername());
        if(findAdmin==null){
            return App.ACCOUNT_EEROR;
        }else {
            if (admin.getPassword().equals(findAdmin.getPassword())){
                session.setAttribute("loginAdmin",findAdmin);
                return App.LOGIN_OK;
            }else{
                return App.PASSWORD_ERROR;
            }
        }
    }

    /**
     * 处理查询所有的管理员的业务
     * @return
     */
    public List<Admin> showAllAdmins() {
        return mapper.selectAllAdmin();
    }

    public List<Role> getAllRoles() {
        return roleMapper.selectAllRoles();
    }

    public Admin loadAdmin(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void updateAdmin(Admin admin) {
        mapper.updateByPrimaryKeySelective(admin);
    }

    public void deleteAdmin(int id) {
        mapper.deleteByPrimaryKey(id);
    }

    public void saveAdmin(Admin admin) {
        Timestamp addTime = new Timestamp(System.currentTimeMillis());
        admin.setAddTime(addTime);
        admin.setDoName("墨轩");
        mapper.insertSelective(admin);
    }
}
