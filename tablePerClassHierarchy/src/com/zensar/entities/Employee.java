package com.zensar.entities;

import java.time.LocalDate;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 11:26;
 * @modification Date 27 sep 2019 11:26
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class.
 */
@Entity
@Table(name = "emp_master")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Emp_type",discriminatorType = DiscriminatorType.CHAR) 
//@DiscriminatorColumn(name = "Emp_type",discriminatorType = DiscriminatorType.STRING) 
//@DiscriminatorColumn(name = "Emp_type",discriminatorType = DiscriminatorType.INTEGER) 
@DiscriminatorValue("A")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	private String name;
	private LocalDate joinDate;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, LocalDate joinDate, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.joinDate = joinDate;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", joinDate=" + joinDate + ", salary=" + salary + "]";
	}

}
