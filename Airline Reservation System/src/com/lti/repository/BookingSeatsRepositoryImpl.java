package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.BookingSeats;

@Repository("bookingSeatsRepository")
public class BookingSeatsRepositoryImpl implements BookingSeatsRepository
{

	@PersistenceContext
	EntityManager em;

	
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	@Transactional
	public BookingSeats addBookingSeats(BookingSeats b) 
	{
		b=em.merge(b);
		em.persist(b);
		System.out.println("BookingSeats added");
		return b;
	}

	@Override
	@Transactional
	public BookingSeats updateBookingSeats(BookingSeats b) 
	{
		em.persist(b);
		return b;
	}

	@Override
	@Transactional
	public void deleteBookingSeats(BookingSeats b) 
	{
		b=em.merge(b);
		em.remove(b);
		
	}

	
}
