// Write your code here

package com.example.movie.repository;
import com.example.movie.model.Movie;
import java.util.ArrayList;

/**
 * MovieRepository
 */
public interface MovieRepository {
    ArrayList<Movie> getMovies();
    Movie addMovie(Movie movie);
    Movie updateMovie(int movieId, Movie movie);
    Movie getMovieById(int movieId);
    void deleteMovie(int movieId);
}