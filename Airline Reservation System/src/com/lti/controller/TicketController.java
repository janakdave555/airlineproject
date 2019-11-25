package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Schedule;
import com.lti.model.Tickets;
import com.lti.services.ScheduleService;
import com.lti.services.TicketsService;


@Controller
public class TicketController 
{

	//@Autowired
	//TicketsService ticketsService;
	
	@Autowired
	ScheduleService scheduleService;
	
	@RequestMapping(value="/bookTicket", method=RequestMethod.GET)
	public ModelAndView bookTicket(int schedule_id)
	{
		//Tickets tck=new Tickets();
	
		
				
		/*
		 * tck.setUsername(username); tck.setNo_of_passengers(no_of_passengers);
		 * tck.setSeat_class(seat_class);
		 */
		Schedule sch=new Schedule();
		sch.setSchedule_id(schedule_id);
		Schedule schedules=scheduleService.findSchedule(schedule_id);
	//	tck.setSchedule(schedules);
		
	//	Tickets ticket=ticketsService.bookTicket(tck);
	//	System.out.println(ticket);
		
		ModelAndView model=null;
	//	System.out.println(ticket);
		System.out.println(sch);
		
		if(schedules==null)
		{
			model=new ModelAndView("addFailed");
		}
		
		else
		
		{
			model = new ModelAndView("bookFlight");
			model.addObject("tickets", schedules);
		}
		
			
			return model;
		}
		
		
	}

