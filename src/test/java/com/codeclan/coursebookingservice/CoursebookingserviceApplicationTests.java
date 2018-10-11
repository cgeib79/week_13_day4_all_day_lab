package com.codeclan.coursebookingservice;

import com.codeclan.coursebookingservice.models.Course;
import com.codeclan.coursebookingservice.models.Customer;
import com.codeclan.coursebookingservice.repository.courses.CourseRepository;
import com.codeclan.coursebookingservice.repository.customers.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	public void canFindCoursesByRating() {
		List<Course> actualCourses = courseRepository.findCoursesByRating(5);

		assertEquals(2, actualCourses.size());
		assertEquals("Intro to R", actualCourses.get(0).getName());
		assertEquals("PDA", actualCourses.get(1).getName());
	}

	@Test
	public void canFindCustomerByCourse(){
		List<Customer> actualCustomer = customerRepository.findCustomersByCourse(1L);
		assertEquals("James", actualCustomer.get(0).getName());
	}
}
