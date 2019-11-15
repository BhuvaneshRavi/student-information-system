package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String dob;
    private String phone;
    private String degree;
    private String gender;
    private String qualification;
    private String yearOfJoining;
    private String joiningTerm;
    private String admissionNumber;
    private String password;


    public String getId() {
        return id;
    }

    public void setId(@JsonProperty("id") String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(@JsonProperty("firstname") String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(@JsonProperty("lastname") String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(@JsonProperty("address") String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(@JsonProperty("email") String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(@JsonProperty("dob") String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(@JsonProperty("phone") String phone) {
        this.phone = phone;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(@JsonProperty("degree") String degree) {
        this.degree = degree;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(@JsonProperty("gender") String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(@JsonProperty("qualification") String qualification) {
        this.qualification = qualification;
    }

    public String getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(@JsonProperty("yearOfJoining") String yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public String getJoiningTerm() {
        return joiningTerm;
    }

    public void setJoiningTerm(@JsonProperty("joiningTerm") String joiningTerm) {
        this.joiningTerm = joiningTerm;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(@JsonProperty("password") String password) {
        this.password = password;
    }

    public String getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(@JsonProperty("admissionNumber") String admissionNumber) {
        this.admissionNumber = admissionNumber;
    }
}
