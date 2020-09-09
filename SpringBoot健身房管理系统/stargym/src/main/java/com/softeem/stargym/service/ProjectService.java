package com.softeem.stargym.service;

import com.softeem.stargym.entity.Project;
import com.softeem.stargym.mapper.ProjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("projectService")
public class ProjectService {
    @Resource
    ProjectMapper mapper;

    public List<Project> getAllProject() {
        return mapper.selectAllProject();
    }

    public Project getProject(int id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void updateProject(Project project) {
        mapper.updateByPrimaryKeySelective(project);
    }


    public void addProject(Project project) {
        mapper.insertSelective(project);
    }

    public void deleteProject(int id) {
        mapper.deleteByPrimaryKey(id);
    }

    public List<Project> selectProjectByName(String name) {
        return mapper.selectProjectByName(name);
    }

}
