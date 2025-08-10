package com.edu.cinema_reservation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HallTest {

    @Test
    void testSettersAndGetters() {
        Hall hall = new Hall();
        hall.setHallId(1L);
        hall.setRows(10);
        hall.setCols(20);

        assertEquals(1L, hall.getHallId());
        assertEquals(10, hall.getRows());
        assertEquals(20, hall.getCols());
    }

    @Test
    void testBuilder() {
        Hall hall = Hall.builder()
                .hallId(1L)
                .rows(10)
                .cols(20)
                .build();

        assertEquals(1L, hall.getHallId());
        assertEquals(10, hall.getRows());
        assertEquals(20, hall.getCols());
    }
}
