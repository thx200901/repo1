package com.softeem.stargym.mapper;

import com.softeem.stargym.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);

    @Select("select * from course ")
    @ResultMap("BaseResultMap")
    List<Course> selectAllCourse();

    @Select("select * from course where course_name like concat('%','${course_name}','%')")
    @ResultMap("BaseResultMap")
    List<Course> selectCourseByName(@Param("course_name") String name);
}