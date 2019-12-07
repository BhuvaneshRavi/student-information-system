package com.project.dbsoftwaredesign.mapper;

import com.project.dbsoftwaredesign.model.Course;
import com.project.dbsoftwaredesign.model.CourseEnrollment;
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

    @Insert("insert into enrollment(studentid,courseid) values (#{username},#{id})")
    void enrollCourse(Course course);

    @Select("select A.studentid,B.id,B.name from enrollment A inner join course B on B.id = A.courseid where A.studentid=#{username}")
    @Results({
            @Result(column = "studentid", property = "username"),
            @Result(column = "id", property = "courseid"),
            @Result(column = "name", property = "name")
    })
    List<CourseEnrollment> viewCourse(CourseEnrollment viewcourse);

    @Delete("delete from enrollment where studentid = #{username} and courseid =#{courseid}")
    void dropCourse(CourseEnrollment dropcourse);
}
