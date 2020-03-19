package pl.bykowski.homework6.homework6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.bykowski.homework6.homework6.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> movieList;


    public MovieService() {
        this.movieList = new ArrayList<>();
        movieList.add(new Movie("Terminator",1987, "Spilberg"));
        movieList.add(new Movie("Terminator 2",1990, "Spilberg"));
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
