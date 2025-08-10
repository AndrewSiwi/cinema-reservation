package com.edu.cinema_reservation;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void testSettersAndGetters() {
        Movie movie = new Movie();
        LocalDate releaseDate = LocalDate.of(2025, 5, 20);

        movie.setMovieId(1L);
        movie.setTitle("Inception");
        movie.setDescription("Sci-fi film od Christophera Nolana");
        movie.setReleaseDate(releaseDate);

        assertEquals(1L, movie.getMovieId());
        assertEquals("Inception", movie.getTitle());
        assertEquals("Sci-fi film od Christophera Nolana", movie.getDescription());
        assertEquals(releaseDate, movie.getReleaseDate());
    }

    @Test
    void testBuilder() {
        LocalDate releaseDate = LocalDate.of(2025, 5, 20);

        Movie movie = Movie.builder()
                .movieId(1L)
                .title("Inception")
                .description("Sci-fi film od Christophera Nolana")
                .releaseDate(releaseDate)
                .build();

        assertEquals(1L, movie.getMovieId());
        assertEquals("Inception", movie.getTitle());
        assertEquals("Sci-fi film od Christophera Nolana", movie.getDescription());
        assertEquals(releaseDate, movie.getReleaseDate());
    }
}
