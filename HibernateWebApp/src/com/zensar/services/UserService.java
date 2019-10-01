package com.zensar.services;

import java.sql.SQLException;
import java.util.List;

import com.zensar.entities.User;
import com.zensar.exception.ServiceExceptions;

/**
 * @author Rohini Ahirrao
 * @version 1.0
 * @creation_date 21st sep 2019 6:00
 * @modification_date 21st sep 2019 6:00
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Buisness service  interface.
 *             it is used in buisness layer of application.
 *
 */

public interface UserService {
	           
	
	void addUser(User user)throws SQLException, ServiceExceptions;
	void updateUser(User user)throws SQLException, ServiceExceptions;
	void removeUser(User user)throws SQLException, ServiceExceptions;
	User findByUsername(String username)throws SQLException,ServiceExceptions;
	List<User> findAllUsers()throws SQLException,ServiceExceptions ;
	
	boolean validateUser(User user) throws ServiceExceptions;
	User getByUserName(String username) throws SQLException;
	
	
	
	
}
