package com.nikhil.departmentservice.service;

import com.nikhil.departmentservice.dto.DepartmentDto;

public interface DepartmentService {
DepartmentDto saveDepartment(DepartmentDto departmentDto);
DepartmentDto getDepartmentByCode(String code);
}
