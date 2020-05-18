package pl.edu.pwsztar.service;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.List;

public interface MovieService {

    List<MovieDto> findAll();
    Movie save(CreateMovieDto createMovieDto);
    void deleteById(Long id);
}
