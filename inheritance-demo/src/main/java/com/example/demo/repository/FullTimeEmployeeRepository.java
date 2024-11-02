package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.FullTimeEmployee;

public interface FullTimeEmployeeRepository extends JpaRepository<FullTimeEmployee,Long> {

}
