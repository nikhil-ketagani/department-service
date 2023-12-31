package com.nikhil.departmentservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "departments")
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
 private Long id;
 private String departmentName;
 private String departmentDescritption;
 private String departmentCode;
 
}
