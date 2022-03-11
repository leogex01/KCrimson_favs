/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Mar 10, 2022
 */
package album.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Records {
	@Id
	@GeneratedValue
	private long id;
	private String title;
	private int releaseDate;
	private double rating;
	
	private String guitarist;

	
	public Records() {
		super();
		this.guitarist = "Fripp";
	}


	public Records(String title) {
		super();
		this.title = title;
	}


	public Records(String title, int releaseDate, double rating) {
		super();
		this.title = title;
		this.releaseDate = releaseDate;
		this.rating = rating;
	}


	public Records(long id, String title, int releaseDate, double rating) {
		super();
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.rating = rating;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}


	public double getRating() {
		return rating;
	}


	public void setRating(double rating) {
		this.rating = rating;
	}
   

	public String getGuitarist() {
		return guitarist;
	}


	public void setGuitarist(String guitarist) {
		this.guitarist = guitarist;
	}


	@Override
	public String toString() {
		return "Records [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", rating=" + rating
				+ ", guitarist=" + guitarist + "]";
	}
	
	

}
