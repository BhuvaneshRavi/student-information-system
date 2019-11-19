package com.project.dbsoftwaredesign.service;

import com.project.dbsoftwaredesign.helper.PasswordGenerator;
import com.project.dbsoftwaredesign.model.Credentials;
import com.project.dbsoftwaredesign.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.dbsoftwaredesign.mapper.StudentMapper;

import java.util.List;

@Service
public class StudentService {

    private StudentMapper studentMapper;

    private CredentialService credentialService;

    @Autowired
    public StudentService(StudentMapper studentMapper, CredentialService credentialService) {
        this.studentMapper = studentMapper;
        this.credentialService = credentialService;
    }

    public Student registerStudent(Student student) {
        String password;
        studentMapper.registerStudent(student);
        Student selectedStudent =  studentMapper.getStudentByAdmissionNumber(student);
        password = PasswordGenerator.getAlphaNumericString(5);
        Credentials credentials = new Credentials();
        credentials.setUsername(selectedStudent.getId());
        credentials.setPassword(password);
        credentials.setType("student");
        credentialService.createCredentials(credentials);
        selectedStudent.setPassword(password);
        return selectedStudent;
    }

    public List<Student> getAllStudents(){
        return studentMapper.getAllStudents();
    }

}
