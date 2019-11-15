package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Course {
    private String id;
    private String name;
    private String department;
    private String level;
    private String credits;
    private String offeringTerm;

    public String getId() {
        return id;
    }

    public void setId(@JsonProperty("id") String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(@JsonProperty("name") String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(@JsonProperty("department") String department) {
        this.department = department;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(@JsonProperty("level") String level) {
        this.level = level;
    }

    public String getCredits() {
        return credits;
    }

    public void setCredits(@JsonProperty("credits") String credits) {
        this.credits = credits;
    }

    public String getOfferingTerm() {
        return offeringTerm;
    }

    public void setOfferingTerm(@JsonProperty("offeringTerm") String offeringTerm) {
        this.offeringTerm = offeringTerm;
    }
}
