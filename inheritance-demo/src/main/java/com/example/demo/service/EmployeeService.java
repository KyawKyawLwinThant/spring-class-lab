package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.ContractEmployee;
import com.example.demo.entity.FullTimeEmployee;
import com.example.demo.entity.PartTimeEmployee;
import com.example.demo.repository.ContractEmployeeRepository;
import com.example.demo.repository.FullTimeEmployeeRepository;
import com.example.demo.repository.PartTimeEmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private ContractEmployeeRepository contractEmployeeRepository;
	@Autowired
	private FullTimeEmployeeRepository fullTimeEmployeeRepository;
	@Autowired
	private PartTimeEmployeeRepository partTimeEmployeeRepository;
	
	@Transactional
	public void createDb() {
		ContractEmployee contractEmployee1=new ContractEmployee("John Doe", 200);
		ContractEmployee contractEmployee2=new ContractEmployee("John William", 300);
		
		FullTimeEmployee fullTimeEmployee1=new FullTimeEmployee("Thomas", 20, 20000);
		FullTimeEmployee fullTimeEmployee2=new FullTimeEmployee("Mary", 20, 20000);
		
		PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("John Updike", 10, 200);
		PartTimeEmployee partTimeEmployee2 = new PartTimeEmployee("Cherry",15, 300);
		
		contractEmployeeRepository.save(contractEmployee1);
		contractEmployeeRepository.save(contractEmployee2);
		
		fullTimeEmployeeRepository.save(fullTimeEmployee1);
		fullTimeEmployeeRepository.save(fullTimeEmployee2);
		
		partTimeEmployeeRepository.save(partTimeEmployee1);
		partTimeEmployeeRepository.save(partTimeEmployee2);
	}

}
