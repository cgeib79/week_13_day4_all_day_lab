package com.codeclan.coursebookingservice.repository.courses;

import com.codeclan.coursebookingservice.models.Course;
import com.codeclan.coursebookingservice.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;


public class CourseRepositoryImpl implements CourseRepositoryCustom {

    @Autowired
    EntityManager entityManager;


    @Override
    @Transactional
    public List<Course> findCoursesByRating(int rating) {
        List<Course> courses = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Course.class);
            criteria.add(Restrictions.eq("starRating", rating));
            courses = criteria.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return courses;
    }

    @Override
    @Transactional
    public List<Course> findCoursesByCustomer(Long customerId) {
        List<Course> courses = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Course.class);
            criteria.createAlias("bookings", "booking");
            criteria.add(Restrictions.eq("booking.customer.id", customerId));
            courses = criteria.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return courses;
    }


}
