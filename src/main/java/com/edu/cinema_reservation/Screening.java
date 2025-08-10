package com.edu.cinema_reservation;

import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Screening {
    private Long screeningId;
    private Long movieId;
    private LocalDateTime dateTime;
    private Long hallId;
}
