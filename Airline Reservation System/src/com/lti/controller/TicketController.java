package com.lti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Flights;
import com.lti.model.Schedule;
import com.lti.model.Tickets;
import com.lti.services.FlightServices;
import com.lti.services.ScheduleService;
import com.lti.services.TicketsService;


@Controller
@SessionAttributes("Schedule")
public class TicketController 
{

	@Autowired
	FlightServices flightService;
	@Autowired
	TicketsService ticketsService;
	
	@Autowired
	ScheduleService scheduleService;
	List<Flights> flight;
	
	@RequestMapping(value="/book", method=RequestMethod.POST)
	public ModelAndView transfer(@RequestParam int schedule_id,@RequestParam int economic_fare,@RequestParam int business_fare)
	{
		
		ModelAndView model = new ModelAndView("bookTicket");
		model.addObject("scheduleId", schedule_id);
		model.addObject("economic_fare",economic_fare);
		model.addObject("business_fare",business_fare);
	
		
			
			return model;
		}
		
	@RequestMapping(value="/bookSuccess",method = RequestMethod.POST)
	public ModelAndView bookC()
	
	{
				ModelAndView model=null;
			
				
		
					model = new ModelAndView("bookingSuccess");
					
				
				return model;
			}
		
	
	
	@RequestMapping(value="/bookTicketController", method=RequestMethod.POST)
	public ModelAndView booked(HttpSession session,@RequestParam String username,@RequestParam String seat_class, @RequestParam int no_of_passengers,@RequestParam int schedule_id)
	{
		
		System.out.println("in controller");
		
		Tickets tickets=new Tickets();
	
			
		Schedule schedule=scheduleService.findSchedule(schedule_id);	  
		

		tickets.setUsername(username);
		tickets.setSeat_class(seat_class);
		tickets.setNo_of_passengers(no_of_passengers);
		
		tickets.setSchedule(schedule);
		System.out.println("schedule-------------------------------------------------------\n");
		System.out.println(schedule);

		Tickets ticket1=ticketsService.bookTicket(tickets);
		
		
		
		ModelAndView model=null;
		
		if(ticket1==null)
		{
			model=new ModelAndView("addFailed");
		}
		
		else
		
		{
			model = new ModelAndView("addSuccess");
			model.addObject("tickets", ticket1);
		}
		
			
			return model;
		}
		
	}

	

