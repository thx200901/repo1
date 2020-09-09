package com.softeem.stargym.service;


import com.softeem.stargym.entity.User;
import com.softeem.stargym.mapper.UserMapper;
import com.softeem.stargym.util.App;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService {
    @Resource
    UserMapper userMapper;

    /**
     * 根据用户的账号
     * @param password
     * @param account
     */
    public int loginUser(String account, String password) {
        User user = userMapper.selectUserByAccount(account);
        if(user==null){
            return App.ACCOUNT_EEROR;
        }else {
            if(password.equals(user.getPassword())){
                return App.LOGIN_OK;
            }else{
                return App.PASSWORD_ERROR;
            }
        }
    }

    public List<User> getAllUser(){
        return  userMapper.selectAllUser();
    }

    public User getUser(int id){
        return  userMapper.selectByPrimaryKey(id);
    }

    public void addUser(User user){
        userMapper.insertSelective(user);
    }

    public void updateUser(User user){
        userMapper.updateByPrimaryKeySelective(user);
    }

    public void deleteUser(int id){
        userMapper.deleteByPrimaryKey(id);
    }

    public List<User> selectUserByName(String name){
        return userMapper.selectUserByName(name);
    }

}
