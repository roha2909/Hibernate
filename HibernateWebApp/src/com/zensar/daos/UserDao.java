package com.zensar.daos;

import java.util.List;

import com.zensar.entities.User;

/**
 * @author Rohini Ahirrao
 * @version 2.0
 * @creation_date 21st sep 2019 5.30
 * @modification_date 28th sep 2019 11:20AM
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Data Access object interface.
 *             it is used in persistence layer of application.
 *
 */

public interface UserDao {
	
	void insert (User user) ;
	void update(User user);
	void delete(User user);
	User getByUserName(String username);
	List<User> getAll();

}
