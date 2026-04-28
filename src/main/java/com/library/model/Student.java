/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.model;

public class Student {

    private int studentId;
    private String name;
    private String studentClass;
    private String semester;
    private String department;
    private String mobile;
    private String email;

    // Empty constructor (important for beginners)
    public Student() {
    }

    // Constructor with parameters
    public Student(int studentId, String name, String studentClass,
                   String semester, String department,
                   String mobile, String email) {

        this.studentId = studentId;
        this.name = name;
        this.studentClass = studentClass;
        this.semester = semester;
        this.department = department;
        this.mobile = mobile;
        this.email = email;
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

