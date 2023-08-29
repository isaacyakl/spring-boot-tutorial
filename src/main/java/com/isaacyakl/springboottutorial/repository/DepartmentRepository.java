package com.isaacyakl.springboottutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isaacyakl.springboottutorial.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    public Department findByDepartmentName(String departmentName);
    
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
