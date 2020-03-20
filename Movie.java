package a3;
public class Movie {
  private String title;
  private int releaseYear;
  private String[] genres; // optional
  private int movieId; //optional
 
  public Movie (){
     title = " ";
     releaseYear = 0;
 } 
public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
}
public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear ;
    }

    public void setReleaseYear(int Artist) {
        this.releaseYear = Artist;
    }
    
public String toString() {
        return this.title + "(" + this.releaseYear + ")";
    }
public boolean equals(Movie c) {
		if( c.title.equals(title)&&(c.releaseYear == releaseYear))
			return true;			
		else
			return false;			
	}
}

