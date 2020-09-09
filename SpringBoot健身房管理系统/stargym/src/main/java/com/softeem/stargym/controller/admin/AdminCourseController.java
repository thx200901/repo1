package com.softeem.stargym.controller.admin;


import com.softeem.stargym.entity.Course;
import com.softeem.stargym.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminCourseController {

    @Resource(name="courseService")
    CourseService courseService;

    @RequestMapping("toCourse.hm")
    public String toCourse(Model model){
        List<Course> course = courseService.getAllCourse();
        model.addAttribute("allCourse",course);
        return "admin/course";
    }

    @RequestMapping("courseadd.hm")
    public String courseadd(){
        return "admin/courseadd";
    }

    @RequestMapping("loadCourse.hm")
    public String loadCourse(int id,Model model){
        Course course = courseService.getCourse(id);
        model.addAttribute("course",course);
        return "admin/courseupdate";
    }

    @RequestMapping("updateCourse.hm")
    public String updateCourse(Course course){
        courseService.updateCourse(course);
        return "redirect:toCourse.hm";
    }

    @RequestMapping("addCourse.hm")
    public String addCourse(Course course){
        courseService.addCourse(course);
        return "redirect:toCourse.hm";
    }

    @RequestMapping("deleteCourse.hm")
    public String deleteCourse(int id){
        courseService.deleteCourse(id);
        return "redirect:toCourse.hm";
    }

    @RequestMapping("selectCourse")
    public String selectCourse(String name,Model model){
        List<Course> course = courseService.selectCourseByName(name);
        model.addAttribute("allCourse",course);
        return "admin/course";
    }

}
