package com.mine.controller;

import com.mine.dto.EmployeeDTO;
import com.mine.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    @RequestMapping("/")
    public ResponseEntity<List<EmployeeDTO>> findAllEmployees(){
        return new ResponseEntity<List<EmployeeDTO>>(employeeService.findAllEmployees(), HttpStatus.OK);
    }
    @PostMapping
    @RequestMapping("/create")
    public ResponseEntity<EmployeeDTO> createEmployee(@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<EmployeeDTO>(employeeService.createEmployee(employeeDTO), HttpStatus.CREATED);
    }
    @GetMapping
    @RequestMapping("/{employeeId}")
    public ResponseEntity<EmployeeDTO> findEmployeeById(@PathVariable Long employeeId){
        return new ResponseEntity<EmployeeDTO>(employeeService.findEmployeeById(employeeId), HttpStatus.OK);
    }

    @PostMapping
    @RequestMapping("/update/{employeeId}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long employeeId, @RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<EmployeeDTO>(employeeService.updateEmployee(employeeId, employeeDTO), HttpStatus.OK);
    }
    @DeleteMapping
    @RequestMapping("/delete/{employeeId}")
    public ResponseEntity<String> deleteEmpoyee(@PathVariable Long employeeId){
        boolean isDeleted = employeeService.deleteEmployee(employeeId);
        String response = (isDeleted ? "employee Deleted" : "employee not deleted" );
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }
}
