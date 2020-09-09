package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Recharge;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface RechargeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);

    @Select("select * from recharge")
    @ResultMap("BaseResultMap")
    List<Recharge> selectAllRecharge();

    @Select("select * from recharge where recharge_name like concat('%','${course_name}','%')")
    @ResultMap("BaseResultMap")
    List<Recharge> selectRechargeByName(@Param("recharge_name")String name);

}