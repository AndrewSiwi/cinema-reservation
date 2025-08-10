package com.edu.cinema_reservation;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    private Long movieId;
    private String title;
    private String description;
    private LocalDate releaseDate;
}
