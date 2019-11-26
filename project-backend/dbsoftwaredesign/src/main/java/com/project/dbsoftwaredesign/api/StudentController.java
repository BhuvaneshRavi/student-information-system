package com.project.dbsoftwaredesign.api;

import com.project.dbsoftwaredesign.model.Student;
import com.project.dbsoftwaredesign.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/student")
@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/registerstudent")
    @CrossOrigin(origins = "http://localhost:4200")
    public Student registerStudent(@RequestBody Student student){
        return studentService.registerStudent(student);
    }

    @GetMapping("/allstudents")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
