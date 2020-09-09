package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Coaches;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CoachesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Coaches record);

    int insertSelective(Coaches record);

    Coaches selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Coaches record);

    int updateByPrimaryKey(Coaches record);

    @Select("select * from coaches ")
    @ResultMap("BaseResultMap")
    List<Coaches> selectAllCoaches();

    @Select("select * from coaches where name like concat('%','${name}','%')")
    @ResultMap("BaseResultMap")
    List<Coaches> selectCoachesByName(@Param("name") String name);
}