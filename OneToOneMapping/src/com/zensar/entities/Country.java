package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 2:57
 * @modification Date 27 sep 2019 2:57
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class.
 */
@Entity
public class Country {
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int countryId;
	private String name;
	private String Language;
	private Long population;
	@OneToOne(mappedBy = "country") //it becomes parent table class nowss
//	@JoinColumn(name = "flag_id") //to explicitily assign foreign key
	private Flag flag;

	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public Long getPopulation() {
		return population;
	}

	public void setPopulation(Long population) {
		this.population = population;
	}

	public Flag getFlag() {
		return flag;
	}

	public void setFlag(Flag flag) {
		this.flag = flag;
	}
	
}
