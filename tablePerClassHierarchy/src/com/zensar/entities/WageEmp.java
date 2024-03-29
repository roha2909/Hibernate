package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 11:49
 * @modification Date 27 sep 2019 11:49
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class.
 */
@Entity
@DiscriminatorValue("E")
public class WageEmp extends Employee {
	private int hours;
	private float rate;
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}
	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}

}
