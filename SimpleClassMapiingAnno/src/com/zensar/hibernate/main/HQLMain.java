//Hibernate Query language(object oriented query language)

package com.zensar.hibernate.main;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product;

public class HQLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c = new Configuration().configure();
		// singleton and heavy weight object
		SessionFactory f = c.buildSessionFactory();
		Session s = f.openSession(); // represents databse connextion ND LIGHT weight
		Transaction t = s.beginTransaction();
		// javax.persistence.Query q= s.createQuery("From Product");
		// JPA(java persistance API) Query
		// javax.persistence.Query q= s.createQuery("From Product p where p.price>4000
		// and p.price<4700");
		// javax.persistence.Query q= s.createQuery("From Product p where p.price
		// between 4000 and 4700");
		// javax.persistence.Query q= s.createQuery("From Product p where p.brand like
		// 's%'");
		// javax.persistence.Query q= s.createQuery("From Product p where
		// p.name='Mobile'");
		/*
		 * List<Product> products =q.getResultList(); for(Product p:products) {
		 * System.out.println(p); }
		 */

		// Query q = s.createQuery("select p.name,p.price from Product p");
		// Query q = s.createQuery("select p.productId,p.name,p.brand from Product p");
		/*
		 * Query q = s.createQuery("select p.name,p.productId,p.price from Product p");
		 * List<Object[]> objects = q.getResultList(); for (Object[] ob : objects) { for
		 * (Object o : ob) {
		 * 
		 * System.out.println(o); } }
		 */
		Query q = s.createQuery("select max(p.price) from Product p");
		Float maxPrice = (Float) q.getSingleResult();
		System.out.println(maxPrice);

		Query q1 = s.createQuery("select min(p.price) from Product p");
		Float minPrice = (Float) q1.getSingleResult();
		System.out.println(minPrice);

		Query q2 = s.createQuery("select sum(p.price) from Product p");
		Double sumPrice = (Double) q2.getSingleResult();
		System.out.println(sumPrice);
		
		Query q3 = s.createQuery("select avg(p.price) from Product p");
		Double avgPrice = (Double) q3.getSingleResult();
		System.out.println(avgPrice);
		
		Query q4 = s.createQuery("select count(p.price) from Product p");
		Long count = (Long) q4.getSingleResult();
		System.out.println(count);
		
		/*
		 * Criteria cr = s.createCriteria(Product.class); List<Product> products =
		 * cr.list(); for(Product pr: products) { System.out.println(pr); }
		 */

		t.commit();
		s.close();
	}

}
