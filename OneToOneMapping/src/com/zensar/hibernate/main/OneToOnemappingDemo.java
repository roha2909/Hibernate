package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Country;
import com.zensar.entities.Flag;

public class OneToOnemappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration c = new Configuration().configure();
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Country coun = new Country();
		Flag fl = new Flag();
		coun.setName("India");
		coun.setLanguage("Hindi");
		coun.setPopulation(2100000l);
		coun.setFlag(fl);

		fl.setFlagName("Tiranaga");
		fl.setDescription("it is tri color flag");
		fl.setCountry(coun);
		s.save(coun);
		
		s.save(fl);
		
		t.commit();
		s.close();
		System.exit(0);

	}

}
