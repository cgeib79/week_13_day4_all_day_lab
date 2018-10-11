package com.codeclan.coursebookingservice.repository.customers;

import com.codeclan.coursebookingservice.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired()
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Customer> findCustomersByCourse(Long courseId) {
        List<Customer> customers = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Customer.class);
            criteria.createAlias("bookings", "booking");
            criteria.add(Restrictions.eq("booking.course.id", courseId));
            customers = criteria.list();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
        }
        return customers;
    }





}
