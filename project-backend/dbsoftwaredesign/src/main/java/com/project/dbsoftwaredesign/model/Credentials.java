package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Credentials {
    private String username;
    private String password;
    private String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(@JsonProperty("username") String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(@JsonProperty("password") String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(@JsonProperty("type") String type) {
        this.type = type;
    }
}
