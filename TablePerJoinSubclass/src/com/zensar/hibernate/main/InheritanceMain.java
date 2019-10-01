package com.zensar.hibernate.main;

import java.time.LocalDate;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 12:06
 * @modification Date 27 sep 2019 12:06
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class.
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setName("Rushikesh");
		e.setJoinDate(LocalDate.of(2019, 07, 07));
		e.setSalary(23300);

		s.save(e);

		WageEmp we = new WageEmp();
		we.setName("Gubbu");
		we.setJoinDate(LocalDate.of(2018, 9, 9));
		we.setSalary(24500);
		we.setHours(10);
		we.setRate(500.0f);
		
		s.save(we);

		t.commit();
		s.close();

	}

}
