package com.example.nguyenmanhhung.service;

import com.example.nguyenmanhhung.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    EmployeeEntity createEmployee(EmployeeEntity employee);
}
