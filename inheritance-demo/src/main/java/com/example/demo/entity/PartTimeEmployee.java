package com.example.demo.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("PART_TIME_EMPLOYEE")
public class PartTimeEmployee extends CompanyEmployee{
	
	private double hourRate;

	public PartTimeEmployee(String name, int vacationDays, double hourRate) {
		super(name, vacationDays);
		this.hourRate = hourRate;
	}

}
