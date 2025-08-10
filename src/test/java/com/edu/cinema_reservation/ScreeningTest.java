package com.edu.cinema_reservation;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

class ScreeningTest {

    @Test
    void testSettersAndGetters() {
        Screening screening = new Screening();
        LocalDateTime dateTime = LocalDateTime.of(2025, 5, 20, 18, 30);

        screening.setScreeningId(1L);
        screening.setMovieId(2L);
        screening.setDateTime(dateTime);
        screening.setHallId(3L);

        assertEquals(1L, screening.getScreeningId());
        assertEquals(2L, screening.getMovieId());
        assertEquals(dateTime, screening.getDateTime());
        assertEquals(3L, screening.getHallId());
    }

    @Test
    void testBuilder() {
        LocalDateTime dateTime = LocalDateTime.of(2025, 5, 20, 18, 30);

        Screening screening = Screening.builder()
                .screeningId(1L)
                .movieId(2L)
                .dateTime(dateTime)
                .hallId(3L)
                .build();

        assertEquals(1L, screening.getScreeningId());
        assertEquals(2L, screening.getMovieId());
        assertEquals(dateTime, screening.getDateTime());
        assertEquals(3L, screening.getHallId());
    }
}
