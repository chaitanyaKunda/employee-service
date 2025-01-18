package com.mine.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employee_id")
    private Long employeeId;
    @Column(name = "Employee_name")
    private String employeeName;
    @Column(name = "Employee_gender")
    private String employeeGender;
    @Column(name = "Employee_qualification")
    private String employeeQualification;
    @Column(name = "Employee_designation")
    private String employeeDesignation;
    @Column(name = "Employee_department")
    private String employeeDepartment;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(String employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
}
