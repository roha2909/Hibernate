package Com.zensar.hibernate.main;

import java.util.List;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 5:54
 * @modification Date 27 sep 2019 5:54
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is main class. 
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.zensar.entities.Movie;
import Com.zensar.entities.Song;

public class MovieDeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure();
		SessionFactory f = con.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();
		Movie m = s.get(Movie.class, 1);
		System.out.println(m.getTitle());
		System.out.println(m.getRealseDate());
		List<Song> songs = m.getSongs();
		for (Song g : songs) {
			System.out.println(g);
		}
		if (m != null) {
			s.delete(m);//cannot delete foreeign key constraint fails
			
		}
		else
		{
			System.out.println("sorryy!!!movie not found");
		}
		t.commit();
		s.close();
	}

}
