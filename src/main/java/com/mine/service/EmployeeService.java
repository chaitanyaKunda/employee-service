package com.mine.service;

import com.mine.dto.EmployeeDTO;
import com.mine.entity.Employee;
import com.mine.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<EmployeeDTO> findAllEmployees(){
        return employeeRepository.findAll().stream().map(EmployeeDTO::toEmployeeDto).toList();
    }
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO){
        Employee employee = employeeRepository.save(EmployeeDTO.toEmployeeEntity(employeeDTO));
        return EmployeeDTO.toEmployeeDto(employee);
    }
    public EmployeeDTO findEmployeeById(Long employeeId){
        Employee employee = employeeRepository.findById(employeeId).orElseThrow(
                () -> new NoSuchElementException("No Employee available with ID: "+employeeId));
        return EmployeeDTO.toEmployeeDto(employee);
    }
    public EmployeeDTO updateEmployee(Long employeeId, EmployeeDTO employeeDTO){
        boolean isEmployeeExists = employeeRepository.existsById(employeeId);
        if(isEmployeeExists){
            Employee employee = employeeRepository.save(EmployeeDTO.toEmployeeEntity(employeeDTO));
            return EmployeeDTO.toEmployeeDto(employee);
        }else{
            throw new NoSuchElementException("No Employee available with ID: "+employeeId);
        }
    }
    public Boolean deleteEmployee(Long employeeId){
        boolean isEmployeeExists = employeeRepository.existsById(employeeId);
        if(isEmployeeExists){
            employeeRepository.deleteById(employeeId);
            return true;
        }else{
            throw new NoSuchElementException("No Employee available with ID: "+employeeId);
        }
    }
}
