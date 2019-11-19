package com.project.dbsoftwaredesign.api;

import com.project.dbsoftwaredesign.model.Course;
import com.project.dbsoftwaredesign.model.Credentials;
import com.project.dbsoftwaredesign.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/course")
@RestController
public class CourseController {
private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/addcourse")
    public String createCourse(@RequestBody Course course){
        courseService.addCourse(course);
        return course.getName().concat("  - course added successfully");
    }

    @PostMapping("/removecourse")
    public String removeCourse(@RequestBody Course course){
        courseService.removeCourse(course);
        return course.getName().concat("  - course removed successfully");
    }

    @GetMapping("/allcourses")
    public List<Course> getAllCredentials(Course course){
        return courseService.allCourses(course);
    }
}
