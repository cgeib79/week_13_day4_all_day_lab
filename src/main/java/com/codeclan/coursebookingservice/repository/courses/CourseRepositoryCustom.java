package com.codeclan.coursebookingservice.repository.courses;

import com.codeclan.coursebookingservice.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByRating(int rating);

    List<Course> findCoursesByCustomer(Long customer);

}
