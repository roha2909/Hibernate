package com.zensar.daos;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.User;

/**
 * @author Rohini Ahirrao
 * @version 2.0
 * @creation_date 21st sep 2019 5.37
 * @modification_date 28rd sep 2019 11:13
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is interface implement class. it is used in persistence layer
 *              of application.
 *
 */
public class UserDaoImpl implements UserDao {

	private Session session;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		session = f.openSession();

	}

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.save(user);
		t.commit();
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.update(user);
		t.commit();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Transaction t = session.beginTransaction();
		session.delete(user);
		t.commit();
	}

	@Override
	public User getByUserName(String username) {
		// TODO Auto-generated method stub
		
		return session.get(User.class, username);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Query q =session.createQuery("from User");
		
		
		return q.getResultList();
	}

}
