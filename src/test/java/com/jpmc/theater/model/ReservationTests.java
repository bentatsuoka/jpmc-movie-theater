package com.jpmc.theater.model;

import org.junit.jupiter.api.Test;

import com.jpmc.theater.model.Customer;
import com.jpmc.theater.model.Reservation;
import com.jpmc.theater.model.Showing;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReservationTests {

    @Test
    void totalFeeTest() {
        Theater theater = new Theater();
        Customer john = new Customer("John Doe", "id-12345");
        Showing showing = theater.getSchedule().get(0);
        int audienceCount = 10;
        double expectedFee = showing.getMovieFee() * audienceCount;
        Reservation res = new Reservation(john, showing, audienceCount);
        double actualFee = res.totalFee();
        assertEquals(expectedFee, actualFee);
    }
}
