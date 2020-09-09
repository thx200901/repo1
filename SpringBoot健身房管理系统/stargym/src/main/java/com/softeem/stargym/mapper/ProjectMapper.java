package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);

    @Select("select * from project")
    @ResultMap("BaseResultMap")
    List<Project> selectAllProject();

    @Select("select * from project where name like concat('%','${name}','%')")
    @ResultMap("BaseResultMap")
    List<Project> selectProjectByName(@Param("name")String name);
}