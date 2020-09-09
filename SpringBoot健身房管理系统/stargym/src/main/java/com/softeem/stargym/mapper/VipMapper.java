package com.softeem.stargym.mapper;


import com.softeem.stargym.entity.Vip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Vip record);

    int insertSelective(Vip record);

    Vip selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);


    @Select("select * from vip ")
    @ResultMap("BaseResultMap")
    List<Vip> selectAllVip();

    @Select("select * from vip where name like concat('%','${name}','%')")
    @ResultMap("BaseResultMap")
    List<Vip> selectVipByName(@Param("name") String name);

}