package com.nikhil.departmentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nikhil.departmentservice.dto.DepartmentDto;
import com.nikhil.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/v1/departments")
@AllArgsConstructor
public class DepartmentController {
DepartmentService departmentService;
@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto) {
		DepartmentDto saveDepartment = departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<DepartmentDto>(saveDepartment, HttpStatus.CREATED);
	}

@GetMapping("{department-code}")
public ResponseEntity<DepartmentDto> getDepartment(@PathVariable("department-code") String departmentCode) {
	DepartmentDto departmentDto = departmentService.getDepartmentByCode(departmentCode);
	return new ResponseEntity<DepartmentDto>(departmentDto, HttpStatus.OK);
}
}
