package com.nikhil.departmentservice.service.impl;

import org.modelmapper.ModelMapper;
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
ModelMapper modelMapper;

	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		//convert Department DTO to Department JPA entity
//		Department department = new Department(
//				departmentDto.getId(),
//				departmentDto.getDepartmentName(),
//				departmentDto.getDepartmentDescritption(),
//				departmentDto.getDepartmentCode()
//				);
		//use Mapstruct library
//		Department department = DepartmentMapper.MAPPER.mapToDepartment(departmentDto);
		
		//use ModelMapper library
		Department department = modelMapper.map(departmentDto, Department.class);
		
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
//		DepartmentDto saveddepartmentDto = DepartmentMapper.MAPPER.mapToDepartmentDto(savedDepartment);
		//use ModelMapper library
		DepartmentDto saveddepartmentDto = modelMapper.map(savedDepartment, DepartmentDto.class);
		return saveddepartmentDto;
	}



	@Override
	public DepartmentDto getDepartmentByCode(String departmentCode) {
		Department department = departmentRepo.findByDepartmentCode(departmentCode);

		//convert  JPA entity  to DTO
//		DepartmentDto departmentDto = new DepartmentDto(
//				department.getId(),
//				department.getDepartmentName(),
//				department.getDepartmentDescritption(),
//				department.getDepartmentCode()
//				);
		//use Mapstruct library
//				DepartmentDto departmentDto = DepartmentMapper.MAPPER.mapToDepartmentDto(department);
				
				//use ModelMapper library
				DepartmentDto departmentDto = modelMapper.map(department, DepartmentDto.class);
		return departmentDto;
	}



}
//