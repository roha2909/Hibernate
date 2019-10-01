package com.zensar.entities;

import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rohini Ahirrao
 * @creation date 26 sep 2019 2:55 PM
 * @modification date 26 sep 2019 2:55 PM
 * @CopyRight : zensar technologies. All rights reserved.
 * @description : it is java bean class.
 * 				  
 *
 */
@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	@Column(name = "cid")
	private int customerId;
	private Name customerName;
	private String gender;
	private int age;
	@Column(nullable = false)
	private String address;
	private LocalDate BirthDate;
	private Blob profilePhoto;
	private Clob  description; //character large object
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	

	public Customer(int customerId, Name customerName, String gender, int age, String address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.age = age;
		this.address = address;
	}



	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Name getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Name customerName) {
		this.customerName = customerName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Blob getProfilePhoto() {
		return profilePhoto;
	}



	public void setProfilePhoto(Blob profilePhoto) {
		this.profilePhoto = profilePhoto;
	}



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public LocalDate getBirthDate() {
		return BirthDate;
	}



	public void setBirthDate(LocalDate birthDate) {
		BirthDate = birthDate;
	}



	public Clob getDescription() {
		return description;
	}



	public void setDescription(Clob description) {
		this.description = description;
	}



	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", gender=" + gender + ", age="
				+ age + ", address=" + address + "]";
	}

	
	}

