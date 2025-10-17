package com.tnsif.adminservices.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admin {

    @Id
    @Column(name = "A_id")
    private int a_id;

    @Column(name = "A_name")
    private String a_name;

    @Column(name = "Email")
    private String email;

    @Column(name = "Password")
    private String password;

    @Column(name = "Phone_Number")
    private String phoneNumber;

    @Column(name = "Role")
    private String role;

    public Admin() {
        super();
    }

    public Admin(int a_id, String a_name, String email, String password, String phoneNumber, String role) {
        super();
        this.a_id = a_id;
        this.a_name = a_name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Admin [a_id=" + a_id + ", a_name=" + a_name + ", email=" + email + ", password=" + password
                + ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
    }
}