package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.BookingSeats;
import com.lti.repository.BookingSeatsRepository;

@Service("bookingSeatsService")
public class BookingSeatsServiceImpl implements BookingSeatsService
{

	@Autowired
	BookingSeatsRepository bookingSeatsRepository;
	

	@Override
	@Transactional
	public BookingSeats addBookingSeats(BookingSeats b) 
	{
		return bookingSeatsRepository.addBookingSeats(b);
	}

	@Override
	@Transactional
	public BookingSeats updateBookingSeats(BookingSeats b) 
	{
		return bookingSeatsRepository.updateBookingSeats(b);
	}

	@Override
	@Transactional
	public void deleteBookingSeats(BookingSeats b) 
	{
		bookingSeatsRepository.deleteBookingSeats(b);
	}

	
}
