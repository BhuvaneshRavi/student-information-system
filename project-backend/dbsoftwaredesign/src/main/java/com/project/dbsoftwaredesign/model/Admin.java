package com.project.dbsoftwaredesign.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Admin {
    String firstname;
    String lastname;
    String address;
    String email;
    String dob;
    String phone;
    String admintype;
    String username;
    String password;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(@JsonProperty("status") String status) {
        this.status = status;
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

    public String getAdmintype() {
        return admintype;
    }

    public void setAdmintype(@JsonProperty("admintype") String admintype) {
        this.admintype = admintype;
    }

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


}
