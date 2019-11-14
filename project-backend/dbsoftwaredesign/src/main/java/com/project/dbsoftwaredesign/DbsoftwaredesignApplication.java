package com.project.dbsoftwaredesign;

import com.project.dbsoftwaredesign.model.Student;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Student.class)
@MapperScan("com.project.dbsoftwaredesign.mapper")
@SpringBootApplication
public class DbsoftwaredesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbsoftwaredesignApplication.class, args);
	}

}
