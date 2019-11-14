package com.project.dbsoftwaredesign.service;

import com.project.dbsoftwaredesign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dbsoftwaredesign.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentService {

    private StudentMapper studentMapper;

    @Autowired
    public StudentService(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public void registerStudent(Student student) {
        studentMapper.registerStudent(student);
    }

    public List<Student> getAllStudents(){
        return studentMapper.getAllStudents();
    }
}
