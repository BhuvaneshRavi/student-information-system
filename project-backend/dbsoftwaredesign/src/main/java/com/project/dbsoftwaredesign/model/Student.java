package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String id;
    private String name;

    public void setId(@JsonProperty("id") String id) {
        this.id = id;
    }

    public void setName(@JsonProperty("name") String name) {
        this.name = name;
    }

    /*public Student(@JsonProperty("id")String id,
                   @JsonProperty("name")String name) {
        this.id = id;
        this.name = name;
    }
*/
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
