package com.nikhil.departmentservice.service.impl;

import org.springframework.stereotype.Service;

import com.nikhil.departmentservice.dto.DepartmentDto;
import com.nikhil.departmentservice.entity.Department;
import com.nikhil.departmentservice.mapper.DepartmentMapper;
import com.nikhil.departmentservice.repository.DepartmentRepository;
import com.nikhil.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
DepartmentRepository departmentRepo;

	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		//convert Department DTO to Department JPA entity
//		Department department = new Department(
//				departmentDto.getId(),
//				departmentDto.getDepartmentName(),
//				departmentDto.getDepartmentDescritption(),
//				departmentDto.getDepartmentCode()
//				);
		Department department = DepartmentMapper.MAPPER.mapToDepartment(departmentDto);
		
		//save Department JPA entity into database
		Department savedDepartment = departmentRepo.save(department);
		
		//convert saved JPA entity back to DTO
//		DepartmentDto saveddepartmentDto = new DepartmentDto(
//				savedDepartment.getId(),
//				savedDepartment.getDepartmentName(),
//				savedDepartment.getDepartmentDescritption(),
//				savedDepartment.getDepartmentCode()
//				);
		//use Mapstruct library
		DepartmentDto saveddepartmentDto = DepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);
		return saveddepartmentDto;
	}



	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = departmentRepo.findByDepartmentCode(departmentCode);
		//covert Department Jpa entity to DepartmentDto
		//convert saved JPA entity back to DTO
//		DepartmentDto departmentDto = new DepartmentDto(
//				department.getId(),
//				department.getDepartmentName(),
//				department.getDepartmentDescritption(),
//				department.getDepartmentCode()
//				);
		//use Mapstruct library
				DepartmentDto departmentDto = DepartmentMapper.MAPPER.mapToDepartmentDto(department);
		return departmentDto;
	}



}
