package Com.zensar.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Rohini Ahirrao
 * @creation Date 27 sep 2019 4:52
 * @modification Date 27 sep 2019 4:52
 * @version 1.0
 * @copyright : zensar Technologies . All rights reserved.
 * @description It is persistance class.
 */
@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int movieId;
	private String title;
	private LocalDate realseDate;
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
	
	private List<Song> songs;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getRealseDate() {
		return realseDate;
	}

	public void setRealseDate(LocalDate realseDate) {
		this.realseDate = realseDate;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

}
