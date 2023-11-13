package com.nikhil.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nikhil.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

	Department findByDepartmentCode(String code);
}
