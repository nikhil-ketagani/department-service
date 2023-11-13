package com.nikhil.departmentservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nikhil.departmentservice.dto.DepartmentDto;
import com.nikhil.departmentservice.entity.Department;

@Mapper
public interface DepartmentMapper {
	DepartmentMapper MAPPER=Mappers.getMapper(DepartmentMapper.class);
	DepartmentDto mapToDepartmentDto(Department department);
	Department mapToDepartment(DepartmentDto departmentDto);
}
