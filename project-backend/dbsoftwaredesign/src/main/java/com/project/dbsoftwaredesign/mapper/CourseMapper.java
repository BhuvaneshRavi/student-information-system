package com.project.dbsoftwaredesign.mapper;

import com.project.dbsoftwaredesign.model.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MySQL-course")
public interface CourseMapper {

    @Insert("insert into course(id,name,department,level,credits,offering_term) values (#{id},#{name},#{department},#{level},#{credits},#{offeringTerm})")
    void createCourse(Course course);

    @Delete("delete from course where id = #{id}")
    void removeCourse(Course course);

    @Select("select * from course")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "department", property = "department"),
            @Result(column = "level", property = "level"),
            @Result(column = "credits", property = "credits"),
            @Result(column = "offering_term", property = "offeringTerm")
    })
    List<Course> allCourses(Course course);
}
