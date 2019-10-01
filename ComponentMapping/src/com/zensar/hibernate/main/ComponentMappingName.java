package com.zensar.hibernate.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Blob;
import java.sql.Clob;
import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.BlobProxy;
import org.hibernate.engine.jdbc.ClobProxy;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class ComponentMappingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration config = new Configuration().configure();
		SessionFactory F = config.buildSessionFactory();
		Session S = F.openSession();
		Transaction T = S.beginTransaction();
		Name name = new Name();
		name.setFirstName("Rohini");
		name.setMiddleName("Dadabhau");
		name.setLastName("Ahirrao");

		Customer cust = new Customer(1237, name, "Female", 23, "pune,chikhali,red");
		cust.setBirthDate(LocalDate.of(1997, 9, 29));
		try {
			File photo = new File("./resources/profile.jfif");
			FileInputStream fi=new FileInputStream(photo);//opening file in read mode
			//hibernate API
			Blob customerPhoto = BlobProxy.generateProxy(fi,photo.length());
			cust.setProfilePhoto(customerPhoto);
			File f2 = new File("./resources/CustomerInfo.txt");
			FileReader fr = new FileReader(f2);
			Clob description = ClobProxy.generateProxy(fr,f2.length());
			cust.setDescription(description);
			S.save(cust);

			T.commit();
			S.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
