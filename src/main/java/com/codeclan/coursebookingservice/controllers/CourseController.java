package com.codeclan.coursebookingservice.controllers;

import com.codeclan.coursebookingservice.models.Course;
import com.codeclan.coursebookingservice.repository.courses.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating){
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping(value = "/customer/{customer}")
    public List<Course> findCoursesByCustomer(@PathVariable Long customer){
        return courseRepository.findCoursesByCustomer(customer);
    }
}
