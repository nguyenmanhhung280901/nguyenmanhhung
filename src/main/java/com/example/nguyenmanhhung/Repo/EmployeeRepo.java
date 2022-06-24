package com.example.nguyenmanhhung.Repo;

import com.example.nguyenmanhhung.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity , Integer> {
}
