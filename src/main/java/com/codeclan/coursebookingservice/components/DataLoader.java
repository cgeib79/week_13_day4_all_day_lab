package com.codeclan.coursebookingservice.components;

import com.codeclan.coursebookingservice.models.Booking;
import com.codeclan.coursebookingservice.models.Course;
import com.codeclan.coursebookingservice.models.Customer;
import com.codeclan.coursebookingservice.repository.bookings.BookingRepository;
import com.codeclan.coursebookingservice.repository.courses.CourseRepository;
import com.codeclan.coursebookingservice.repository.customers.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {


        Course course1 = new Course("Intro to R", "Glasgow", 5);
        courseRepository.save(course1);

        Course course2 = new Course ("PDA", "Glasgow", 5);
        courseRepository.save(course2);

        Course course3 = new Course ("Agile Training", "Edinburgh", 3);
        courseRepository.save(course3);

        Customer customer1 = new Customer("James", "Glasgow", 30);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("Alice", "Edinburgh", 25);
        customerRepository.save(customer2);

        Customer customer3 = new Customer("William", "Glasgow", 40);
        customerRepository.save(customer3);

        Booking booking1 = new Booking("24-10-18", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("24-10-18", course1, customer3);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("01-12-18", course3, customer2);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("01-02-19", course2, customer1);
        bookingRepository.save(booking4);


    }
}
