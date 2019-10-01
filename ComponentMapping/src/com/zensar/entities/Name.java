
package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Rohini Ahirrao
 * @creation date 26 sep 2019 2:44 PM
 * @modification date 26 sep 2019 2:44 PM
 * @CopyRight : zensar technologies. All rights reserved.
 * @description : it is java bean class.
 * 
 *
 */
@Embeddable
public class Name {
	@Column(name = "first_name",length = 30)//length reduces its size
	private String firstName;
	@Column(nullable = false)
	private String middleName;
	private String lastName;

	public Name() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}

	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
}
