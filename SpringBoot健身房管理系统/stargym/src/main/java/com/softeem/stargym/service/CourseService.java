package com.softeem.stargym.service;

import com.softeem.stargym.entity.Course;
import com.softeem.stargym.mapper.CourseMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("courseService")
public class CourseService {
    @Resource
    CourseMapper mapper;

    public List<Course> getAllCourse(){
        return mapper.selectAllCourse();
    }

    public Course getCourse(int id){
        return mapper.selectByPrimaryKey(id);
    }

    public void updateCourse(Course course){
        mapper.updateByPrimaryKeySelective(course);
    }

    public void addCourse(Course course){
        mapper.insertSelective(course);
    }

    public void deleteCourse(int id){
        mapper.deleteByPrimaryKey(id);
    }

    public List<Course> selectCourseByName(String name){
        return  mapper.selectCourseByName(name);
    }
}
