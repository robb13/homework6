package pl.bykowski.homework6.homework6.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.bykowski.homework6.homework6.Aop.SendMail;
import pl.bykowski.homework6.homework6.model.Movie;
import pl.bykowski.homework6.homework6.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieApi {

    private MovieService movieService;


    @Autowired
    public MovieApi(MovieService movieService ) {
        this.movieService = movieService;

    }

    @GetMapping("/all-movies")
    public ResponseEntity<List<Movie>> getMovieList () {

        return new ResponseEntity<>(movieService.getMovieList(), HttpStatus.OK);

    }


    @PostMapping("/add-movies")
    @SendMail
    public ResponseEntity<List<Movie>> addNewMovie(@RequestBody Movie newMovie) {
        if (movieService.getMovieList().add(newMovie) == true) {

            return new ResponseEntity<>(movieService.getMovieList(), HttpStatus.OK);
        }
        return new ResponseEntity<>(movieService.getMovieList(), HttpStatus.NOT_MODIFIED);
    }


}
