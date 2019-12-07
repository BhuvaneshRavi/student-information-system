package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CourseEnrollment {

    private String username;
    private String courseid;
    private String name;
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(@JsonProperty("status")String status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(@JsonProperty("username") String username) {
        this.username = username;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(@JsonProperty("courseid") String courseid) {
        this.courseid = courseid;
    }

    public String getName() {
        return name;
    }

    public void setName(@JsonProperty("name") String name) {
        this.name = name;
    }


}
