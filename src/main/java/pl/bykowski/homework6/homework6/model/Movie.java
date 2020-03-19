package pl.bykowski.homework6.homework6.model;

public class Movie {

    private String title;
    private int year;
    private String movieMaker;

    public Movie(String title, int year, String movieMaker) {
        this.title = title;
        this.year = year;
        this.movieMaker = movieMaker;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovieMaker() {
        return movieMaker;
    }

    public void setMovieMaker(String movieMaker) {
        this.movieMaker = movieMaker;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", movieMaker='" + movieMaker + '\'' +
                '}';
    }
}
