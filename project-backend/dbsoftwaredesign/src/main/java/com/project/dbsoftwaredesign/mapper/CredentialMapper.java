package com.project.dbsoftwaredesign.mapper;

import com.project.dbsoftwaredesign.model.Admin;
import com.project.dbsoftwaredesign.model.Credentials;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("MySQL-credentials")
public interface CredentialMapper {

    @Insert("insert into credentials(username,password,type) values (#{username},#{password},#{type})")
    void createCredentials(Credentials credentials);

    @Insert("insert into admin(firstname,lastname,address,email,dob,phone,admintype) values (#{firstname},#{lastname},#{address},#{email},#{dob},#{phone},#{admintype})")
    void addAdmin(Admin admin);

    @Delete("delete from credentials where username = #{username}")
    void removeCredentials(Credentials credentials);

    @Select("select * from credentials")
    @Results({
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "type", property = "type"),
    })
    List<Credentials> allCredentials(Credentials credentials);

    @Select("select * from credentials where username = #{username}")
    @Results({
    @Result(column = "username", property = "username"),
    @Result(column = "password", property = "password"),
    @Result(column = "type", property = "type"),
    })
    Credentials checkCredentials(Credentials credentials);
}
