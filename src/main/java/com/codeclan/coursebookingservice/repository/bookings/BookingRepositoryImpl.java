package com.codeclan.coursebookingservice.repository.bookings;

import com.codeclan.coursebookingservice.models.Booking;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class BookingRepositoryImpl implements BookingRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Booking> findBookingsByDate(String date){
        List<Booking> bookings = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria criteria = session.createCriteria(Booking.class);
            criteria.add(Restrictions.eq("date", date));
            bookings = criteria.list();
        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
        return bookings;
    }
}
