package com.codeclan.coursebookingservice.repository.courses;

import com.codeclan.coursebookingservice.models.Course;
import com.codeclan.coursebookingservice.repository.customers.CustomerRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

}
