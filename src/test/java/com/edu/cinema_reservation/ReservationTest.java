package com.edu.cinema_reservation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void testSettersAndGetters() {
        Reservation reservation = new Reservation();
        reservation.setReservationId(1L);
        reservation.setCustomerEmail("john@example.com");
        reservation.setSeatRow(5);
        reservation.setSeatCol(8);
        reservation.setStatus("CONFIRMED");

        assertEquals(1L, reservation.getReservationId());
        assertEquals("john@example.com", reservation.getCustomerEmail());
        assertEquals(5, reservation.getSeatRow());
        assertEquals(8, reservation.getSeatCol());
        assertEquals("CONFIRMED", reservation.getStatus());
    }

    @Test
    void testBuilder() {
        Reservation reservation = Reservation.builder()
                .reservationId(1L)
                .customerEmail("john@example.com")
                .seatRow(5)
                .seatCol(8)
                .status("CONFIRMED")
                .build();

        assertEquals(1L, reservation.getReservationId());
        assertEquals("john@example.com", reservation.getCustomerEmail());
        assertEquals(5, reservation.getSeatRow());
        assertEquals(8, reservation.getSeatCol());
        assertEquals("CONFIRMED", reservation.getStatus());
    }
}
