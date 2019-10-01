package com.zensar.hibernate.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Customer;
import com.zensar.entities.Name;

public class CustomerGetDemo {
public static void main(String[] args) {
	Configuration config = new Configuration().configure();
	SessionFactory F = config.buildSessionFactory();
	Session S = F.openSession();
	Transaction T = S.beginTransaction();
	Customer cu =  S.get(Customer.class,1237);
	System.out.println(cu.getCustomerId());
	System.out.println(cu.getAddress());
	System.out.println(cu.getAge());
	System.out.println(cu.getGender());
	System.out.println(cu.getBirthDate());
	
	cu.getAge();
	cu.getGender();
	cu.getBirthDate();
	Name CustomerName =cu.getCustomerName();
	System.out.println(CustomerName);
	Blob custPhoto = cu.getProfilePhoto();
	try {
		InputStream io = custPhoto.getBinaryStream();
		FileOutputStream fo = new FileOutputStream("./resources/newphoto.jfif");
		int data=0;
		while((data=io.read())!=-1)
		{
			fo.write(data);
			
		}
		fo.close();
		Clob description = cu.getDescription();
		Reader r = description.getCharacterStream();
		PrintWriter pw= new PrintWriter("./resources/CustomerDBInfo.txt");
		int charData = 0;
		while((charData = r.read())!=-1)
		{
			pw.print((char)charData);
		}
		r.close();
		pw.close();
		
		
		T.commit();
		S.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
