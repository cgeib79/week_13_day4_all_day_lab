package com.codeclan.coursebookingservice.repository.bookings;

import com.codeclan.coursebookingservice.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> findBookingsByDate(String date);

}
