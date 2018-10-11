package com.codeclan.coursebookingservice.controllers;

import com.codeclan.coursebookingservice.models.Booking;
import com.codeclan.coursebookingservice.repository.bookings.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingsController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date){
        return bookingRepository.findBookingsByDate(date);
    }

}
