package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Tickets;

@Repository("ticketsRepository")
public class TicketsRepositoryImpl implements TicketsRepository
{
	
	@PersistenceContext
	EntityManager em;




	@Override
	@Transactional
	public Tickets bookTicket(Tickets t)
	{
		
		t=em.merge(t);
		em.persist(t);
		System.out.println("Ticket added");
		return t;
	}



}
