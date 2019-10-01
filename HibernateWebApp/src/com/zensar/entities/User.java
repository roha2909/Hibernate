package com.zensar.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Rohini Ahirrao
 * @version 2.0
 * @creation_date 28th sep 2019 5.23
 * @modification_date 28 th sep 2019 11:24AM
 * @copyright Zensar Technologies.All rights reserved.
 * @description this is entity class.
 *
 */
@Entity
@Table(name = "user_login")
public class User {
@Id
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}

