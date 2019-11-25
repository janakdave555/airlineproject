package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Tickets;
import com.lti.repository.TicketsRepository;

@Service("ticketsService")
public class TicketsServicesImpl implements TicketsService
{
	
	@Autowired
	TicketsRepository ticketsRepository;

	@Override
	@Transactional
	public Tickets bookTicket(Tickets t)
	{
		return ticketsRepository.bookTicket(t);
	}

}
