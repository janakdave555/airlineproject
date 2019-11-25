package com.lti.repository;

import com.lti.model.BookingSeats;

public interface BookingSeatsRepository
{

	public BookingSeats addBookingSeats(BookingSeats b);
	public BookingSeats updateBookingSeats(BookingSeats b);
	public void deleteBookingSeats(BookingSeats b);
	
}
