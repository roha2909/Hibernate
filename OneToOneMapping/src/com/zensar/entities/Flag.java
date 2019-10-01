package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 3:03
 * @modification Date 27 sep 2019 3:03
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class. 
 */
@Entity
public class Flag {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int flagId;
private String flagName;
private String Description;
@OneToOne
@JoinColumn(name="country_id")
private Country country;
public int getFlagId() {
	return flagId;
}
public void setFlagId(int flagId) {
	this.flagId = flagId;
}
public String getFlagName() {
	return flagName;
}
public void setFlagName(String flagName) {
	this.flagName = flagName;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}


}
