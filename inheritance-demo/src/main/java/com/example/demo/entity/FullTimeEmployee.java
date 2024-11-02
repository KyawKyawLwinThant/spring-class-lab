package com.example.demo.entity;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("FULLTIME_EMPLOYEE")
public class FullTimeEmployee extends CompanyEmployee {
	
	private double salary;

	public FullTimeEmployee(String name, int vacationDays, double salary) {
		super(name, vacationDays);
		this.salary = salary;
	}
	
	

}
