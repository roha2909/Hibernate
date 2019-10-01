package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration c = new Configuration().configure();
//singleton and heavy weight object
SessionFactory f= c.buildSessionFactory();
Session s = f.openSession(); //represents databse connextion ND LIGHT weight
Transaction t = s.beginTransaction();

//insert new record 
//Product p = new Product(1007, "mouse", "DEll", 4600.00f);
//s.save(p);

//get record according to primary key

		/*
		 * Product p= s.get(Product.class, 1002); if(p==null) {
		 * System.out.println("Errror!!Data not Avaliable"); }else { //Product p=
		 * s.load(Product.class, 1002); System.out.println(p); }
		 */


//update records

		/*
		 * Product p= s.get(Product.class, 1002); if(p==null) {
		 * System.out.println("Errror!!Data not Avaliable"); }else {
		 * p.setPrice(p.getPrice()+1); System.out.println(p); }
		 */


//Delete Record

Product p= s.get(Product.class, 1002); 
if(p!=null)
{
	s.delete(p);
}
else
{
	System.out.println("delete cannot happen!!!!!!!!!!");
}
t.commit();
s.close();
	}

}
