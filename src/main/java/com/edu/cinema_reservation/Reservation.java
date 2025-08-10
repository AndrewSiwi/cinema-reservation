package com.edu.cinema_reservation;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {
    private Long reservationId;
    private String customerEmail;
    private Integer seatRow;
    private Integer seatCol;
    private String status;
}
