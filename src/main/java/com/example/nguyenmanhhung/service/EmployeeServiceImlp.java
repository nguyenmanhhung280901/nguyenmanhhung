package com.example.nguyenmanhhung.service;

import com.example.nguyenmanhhung.Repo.EmployeeRepo;
import com.example.nguyenmanhhung.entity.EmployeeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImlp implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;
    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public EmployeeEntity createEmployee(EmployeeEntity employee) {
        return employeeRepo.save(employee);
    }
}
