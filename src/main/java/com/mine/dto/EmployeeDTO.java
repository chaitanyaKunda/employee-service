package com.mine.dto;

import com.mine.entity.Employee;

public class EmployeeDTO {
    private Long employeeId;
    private String employeeName;
    private String employeeGender;
    private String employeeQualification;
    private String employeeDesignation;
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

    public static Employee toEmployeeEntity(EmployeeDTO employeeDTO){
        Employee employeeEntity = new Employee();
        employeeEntity.setEmployeeId(employeeDTO.getEmployeeId());
        employeeEntity.setEmployeeName(employeeDTO.getEmployeeName());
        employeeEntity.setEmployeeGender(employeeDTO.getEmployeeGender());
        employeeEntity.setEmployeeDesignation(employeeDTO.getEmployeeDesignation());
        employeeEntity.setEmployeeDepartment(employeeDTO.getEmployeeDepartment());
        employeeEntity.setEmployeeQualification(employeeDTO.getEmployeeQualification());
        return employeeEntity;
    }

    public static EmployeeDTO toEmployeeDto(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmployeeId(employee.getEmployeeId());
        employeeDTO.setEmployeeName(employee.getEmployeeName());
        employeeDTO.setEmployeeGender(employee.getEmployeeGender());
        employeeDTO.setEmployeeDesignation(employee.getEmployeeDesignation());
        employeeDTO.setEmployeeDepartment(employee.getEmployeeDepartment());
        employeeDTO.setEmployeeQualification(employee.getEmployeeQualification());
        return employeeDTO;
    }
}
