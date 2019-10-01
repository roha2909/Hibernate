package Com.zensar.hibernate.main;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 5:10
 * @modification Date 27 sep 2019 5:10
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is main class. 
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.zensar.entities.Movie;
import Com.zensar.entities.Song;

public class OneToManyMappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure();
		SessionFactory f = con.buildSessionFactory();
		Session s = f.openSession();
		Transaction t = s.beginTransaction();

		Movie mo = new Movie();

		mo.setTitle("jane tu ya jane na");
		mo.setRealseDate(LocalDate.of(2008, 9, 03));

		Song so = new Song("kabhi kabhi additeeee");
		Song so1 = new Song("jane tu mera kya hai");
		Song so2 = new Song("kaise mujhe tum mil gayi");

		so.setMovie(mo);
		so1.setMovie(mo);
		so2.setMovie(mo);

		List<Song> songs = new ArrayList<Song>();
		songs.add(so);
		songs.add(so1);

		songs.add(so2);
		mo.setSongs(songs);
		
		s.save(mo);
		s.save(so);
		s.save(so1);
		s.save(so2);
	

		t.commit();
		s.close();
		System.exit(0);
	}

}
