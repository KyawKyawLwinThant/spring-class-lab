package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.PartTimeEmployee;

public interface PartTimeEmployeeRepository extends 
	JpaRepository<PartTimeEmployee,Long> {

}
