package com.softeem.stargym.entity;

import java.util.Date;

public class Course {
    private Integer id;

    private String courseName;

    private String courseDir;

    private String coaches;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private String doName;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseDir() {
        return courseDir;
    }

    public void setCourseDir(String courseDir) {
        this.courseDir = courseDir == null ? null : courseDir.trim();
    }

    public String getCoaches() {
        return coaches;
    }

    public void setCoaches(String coaches) {
        this.coaches = coaches == null ? null : coaches.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDoName() {
        return doName;
    }

    public void setDoName(String doName) {
        this.doName = doName == null ? null : doName.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}