package shop.growith.api.movie.domain;

import lombok.Data;

@Data
public class MovieDto {
    private long movieId;
    private String title;
    private String direction;
    private String genre;
    private String rate;
}