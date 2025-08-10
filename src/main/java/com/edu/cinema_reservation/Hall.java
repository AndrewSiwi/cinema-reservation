package com.edu.cinema_reservation;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Hall {
    private Long hallId;
    private Integer rows;
    private Integer cols;
}
