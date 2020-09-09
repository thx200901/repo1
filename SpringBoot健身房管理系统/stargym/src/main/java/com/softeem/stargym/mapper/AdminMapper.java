package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Admin;
import com.softeem.stargym.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

    @Select("select * from admin where username=#{username}")
    @ResultMap("AdminMap")
    Admin findAdminByUsername(String username);


    /**
     * 查询所有管理员
     * @return
     */
    @Select("select * from admin")
    @ResultMap("AdminMap")
    List<Admin> selectAllAdmin();



}