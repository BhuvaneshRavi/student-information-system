package com.project.dbsoftwaredesign.api;

import com.project.dbsoftwaredesign.model.Course;
import com.project.dbsoftwaredesign.model.CourseEnrollment;
import com.project.dbsoftwaredesign.model.Credentials;
import com.project.dbsoftwaredesign.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/v1/course")
@RestController
public class CourseController {
private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/addcourse")
    @CrossOrigin(origins = "http://localhost:4200")
    public Course createCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PostMapping("/removecourse")
    @CrossOrigin(origins = "http://localhost:4200")
    public Course removeCourse(@RequestBody Course course){
        courseService.removeCourse(course);
        course.setStatus("true");
        return course;
    }

    @GetMapping("/allcourses")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Course> getAllCredentials(Course course){
        return courseService.allCourses(course);
    }

    @PostMapping("/enrollcourse")
    @CrossOrigin(origins = "http://localhost:4200")
    public Course enrollCourse(@RequestBody Course course){
        courseService.enrollCourse(course);
        course.setStatus("true");
        return course;
    }

    @PostMapping("/viewcourse")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<CourseEnrollment> viewCourse(@RequestBody CourseEnrollment viewcourse){
        return courseService.viewCourse(viewcourse);
    }

    @PostMapping("/dropcourse")
    @CrossOrigin(origins = "http://localhost:4200")
    public CourseEnrollment dropCourse(@RequestBody CourseEnrollment viewcourse){
        courseService.dropCourse(viewcourse);
        viewcourse.setStatus("true");
        return viewcourse;
    }

}

