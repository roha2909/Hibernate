package com.zensar.services;
/**
 * @author Rohini Ahirrao
 * @version 2.0
 * @creation_date 21st sep 2019 5.30
 * @modification_date 28th sep 2019 11:48AM
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Business service interface.
 *             
 *
 */
import java.sql.SQLException;
import java.util.List;

import com.zensar.daos.UserDao;
import com.zensar.entities.User;
import com.zensar.exception.ServiceExceptions;

public class UserServiceImpl implements UserService {
private UserDao userDao;

public void setUserDao(UserDao userDao) {
this.userDao = userDao;
}

@Override
public void addUser(User user) throws ServiceExceptions {
userDao.insert(user);
}

@Override
public void updateUser(User user) throws ServiceExceptions {
userDao.update(user);
}

@Override
public void removeUser(User user) throws ServiceExceptions {
userDao.delete(user);
}

public User findUserByUsername(String username) throws ServiceExceptions {
	User user=userDao.getByUserName(username);
	return user;
	}

@Override
public List<User> findAllUsers() throws ServiceExceptions {
return userDao.getAll();


}

@Override
public boolean validateUser(User user) throws ServiceExceptions {
// TODO Auto-generated method stub
User dbUser=findUserByUsername(user.getUsername());
if(dbUser!=null && dbUser.getPassword().equals(user.getPassword()))
return true;
else
return false;
}

@Override
public User findByUsername(String username) throws SQLException, ServiceExceptions {
	// TODO Auto-generated method stub
	return null;
}

@Override
public User getByUserName(String username) throws SQLException {
	// TODO Auto-generated method stub
	return null;
}

}
