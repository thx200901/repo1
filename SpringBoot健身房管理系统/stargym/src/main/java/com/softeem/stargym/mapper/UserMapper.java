package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);




    @Select("select * from user where username=#{account} or email=#{account} or phone=#{account}")
    User selectUserByAccount(String account);

    @Select("select * from user")
    @ResultMap("BaseResultMap")
    List<User> selectAllUser();

    @Select("select * from user where name like concat('%','${name}','%')")
    @ResultMap("BaseResultMap")
    List<User> selectUserByName(@Param("name")String name);
}