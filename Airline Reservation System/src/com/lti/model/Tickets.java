package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Tickets
{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_seq")
	@SequenceGenerator(sequenceName = "ticket_seq", name = "ticket_seq", allocationSize = 1)
	int ticket_id;
	
	@OneToOne
	@JoinColumn(name="schedule_id")
	Schedule schedule;
	
	
	@Column(name="no_of_passenger")
	int no_of_passengers;
	String username;
	String seat_class;
	
	public Tickets() 
	{
		
	}

	

	public Tickets(int ticket_id, Schedule schedule, int no_of_passengers, String username, String seat_class) {
		super();
		this.ticket_id = ticket_id;
		this.schedule = schedule;
		this.no_of_passengers = no_of_passengers;
		this.username = username;
		this.seat_class = seat_class;
	}


	

	
	public Schedule getSchedule() {
		return schedule;
	}



	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}



	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}


	public int getNo_of_passengers() {
		return no_of_passengers;
	}

	public void setNo_of_passengers(int no_of_passengers) {
		this.no_of_passengers = no_of_passengers;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSeat_class() {
		return seat_class;
	}

	public void setSeat_class(String seat_class) {
		this.seat_class = seat_class;
	}



	@Override
	public String toString() {
		return "Tickets [ticket_id=" + ticket_id + ", schedule=" + schedule + ", no_of_passengers=" + no_of_passengers
				+ ", username=" + username + ", seat_class=" + seat_class + "]";
	}

	
	
	
	
	
}
