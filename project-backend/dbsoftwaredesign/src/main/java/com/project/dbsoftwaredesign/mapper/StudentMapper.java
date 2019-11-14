package com.project.dbsoftwaredesign.mapper;

import com.project.dbsoftwaredesign.model.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MySQL")
public interface StudentMapper {

    @Insert("insert into student(id,name) values (#{id},#{name})")
    void registerStudent(Student student);

    @Select("select * from student")
    List<Student> getAllStudents();
}