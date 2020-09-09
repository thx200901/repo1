package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Suggestion;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SuggestionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Suggestion record);

    int insertSelective(Suggestion record);

    Suggestion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Suggestion record);

    int updateByPrimaryKey(Suggestion record);

    @Select("Select * from suggestion")
    @ResultMap("BaseResultMap")
    List<Suggestion> selectAllSuggestion();

    @Select("select * from suggestion where name like concat('%','${name}','%'")
    @ResultMap("BaseResultMap")
    List<Suggestion> selectSuggestionByName(@Param("name")String name);

}