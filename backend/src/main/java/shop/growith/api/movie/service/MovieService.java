package shop.growith.api.movie.service;

import shop.growith.api.movie.domain.MovieDto;

import java.util.ArrayList;

public interface MovieService {
    void addMovie(MovieDto movieDto);

    MovieDto searchMovie(String title) throws Exception;

    void delMovie(String title);

    ArrayList<MovieDto> listMovie() throws Exception;
}