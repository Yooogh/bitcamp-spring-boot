package shop.growith.api.movie.controller;

import shop.growith.api.movie.service.MovieServiceImpl;
import shop.growith.api.plex.domain.Plex;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.growith.api.movie.service.MovieServiceImpl;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieServiceImpl movieService;
}