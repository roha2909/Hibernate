package Com.zensar.entities;
/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 4:43
 * @modification Date 27 sep 2019 4:43
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class. 
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int songId;
	private String name;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	private Movie movie;
	public Song() {
		// TODO Auto-generated constructor stub
	}
	public Song( String name) {
		super();
		
		this.name = name;
	}
	public int getSongId() {
		return songId;
	}
	public void setSongId(int songId) {
		this.songId = songId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Song [songId=" + songId + ", name=" + name + "]";
	}
	

}
