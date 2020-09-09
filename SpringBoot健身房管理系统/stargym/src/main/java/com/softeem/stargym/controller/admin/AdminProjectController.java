package com.softeem.stargym.controller.admin;

import com.softeem.stargym.entity.Project;
import com.softeem.stargym.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminProjectController {

    @Resource(name="projectService")
    ProjectService projectService;

    @RequestMapping("toProject.hm")
    public String toProject(Model model){
        List<Project> project = projectService.getAllProject();
        model.addAttribute("allProject",project);
        return "admin/project";
    }

    @RequestMapping("projectadd.hm")
    public String projectadd(){
        return "admin/projectadd";
    }


    @RequestMapping("loadProject.hm")
    public String loadProject(int id,Model model){
        Project project = projectService.getProject(id);
        model.addAttribute("project",project);
        return "admin/projectupdate";
    }

    @RequestMapping("updateProject.hm")
    public String updateProject(Project project){
        projectService.updateProject(project);
        return "redirect:toProject.hm";
    }

    @RequestMapping("addProject.hm")
    public String addProject(Project project){
        projectService.addProject(project);
        return "redirect:toProject.hm";
    }

    @RequestMapping("deleteProject.hm")
    public String deleteProject(int id){
        projectService.deleteProject(id);
        return "redirect:toProject.hm";
    }

    @RequestMapping("selectProject")
    public String selectProject(String name,Model model){
       List<Project> projects = projectService.selectProjectByName(name);
       model.addAttribute("allProject",projects);
        return "admin/project";
    }

}