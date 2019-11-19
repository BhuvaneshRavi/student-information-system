package com.project.dbsoftwaredesign.mapper;

import com.project.dbsoftwaredesign.model.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MySQL-student")
public interface StudentMapper {

    @Insert("insert into student(firstname,lastname,address,email,dob,phone,degree,gender,qualification,year_of_joining,joining_term,admission_number)  VALUES (#{firstname},#{lastname},#{address},#{email},#{dob},#{phone},#{degree},#{gender},#{qualification},#{yearOfJoining},#{joiningTerm},#{admissionNumber})")
    void registerStudent(Student student);

    @Select("select id, firstname,lastname,address,email,dob,phone,degree,gender,qualification,year_of_joining,joining_term,admission_number from student where admission_number = #{admissionNumber}")
    @Results({
            @Result(column="id", property="id"),
            @Result(column="firstname", property="firstname"),
            @Result(column="lastname", property="lastname"),
            @Result(column="address", property="address"),
            @Result(column="email", property="email"),
            @Result(column="dob", property="dob"),
            @Result(column="phone", property="phone"),
            @Result(column="degree", property="degree"),
            @Result(column="gender", property="gender"),
            @Result(column="qualification", property="qualification"),
            @Result(column="yearOfJoining", property="year_of_joining"),
            @Result(column="joiningTerm", property="joining_term"),
            @Result(column="admissionNumber", property="admission_number")
    })
    Student getStudentByAdmissionNumber(Student student);

    @Select("select * from student")
    @Results({
            @Result(column="id", property="id"),
            @Result(column="firstname", property="firstname"),
            @Result(column="lastname", property="lastname"),
            @Result(column="address", property="address"),
            @Result(column="email", property="email"),
            @Result(column="dob", property="dob"),
            @Result(column="phone", property="phone"),
            @Result(column="degree", property="degree"),
            @Result(column="gender", property="gender"),
            @Result(column="qualification", property="qualification"),
            @Result(column="yearOfJoining", property="year_of_joining"),
            @Result(column="joiningTerm", property="joining_term"),
            @Result(column="admissionNumber", property="admission_number")
    })
    List<Student> getAllStudents();

}