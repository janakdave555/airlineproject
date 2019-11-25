package com.lti.services;

import com.lti.model.BookingSeats;

public interface BookingSeatsService 
{

	public BookingSeats addBookingSeats(BookingSeats b);
	public BookingSeats updateBookingSeats(BookingSeats b);
	public void deleteBookingSeats(BookingSeats b);
	
}
