package com.project.dbsoftwaredesign.service;

import com.project.dbsoftwaredesign.mapper.CourseMapper;
import com.project.dbsoftwaredesign.model.Course;
import com.project.dbsoftwaredesign.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseMapper courseMapper;

    @Autowired
    public CourseService(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    public void addCourse(Course course){
        courseMapper.createCourse(course);
    }

    public void removeCourse(Course course){
        courseMapper.removeCourse(course);
    }

    public List<Course> allCourses(Course course){
        return courseMapper.allCourses(course);
    }
}
