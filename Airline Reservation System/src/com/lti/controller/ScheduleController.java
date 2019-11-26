package com.lti.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Flights;
import com.lti.model.Schedule;
import com.lti.services.FlightServices;
import com.lti.services.ScheduleService;
import com.lti.util.DateWorker;

@Controller
public class ScheduleController
{
	
	@Autowired
	ScheduleService scheduleService;
	@Autowired
	FlightServices flightService;

	@RequestMapping(value="/addSchedule", method=RequestMethod.POST)
	public ModelAndView addSchedule(
			Date flight_date,
			String departure_time,
			String arrival_time,
			String duration,
			int flight_id)
			{
				
		
				Flights flight=new Flights();
		
				Schedule schedules=new Schedule();
				
				schedules.setFlight_date(flight_date);
				schedules.setDeparture_time(departure_time);
				schedules.setArrival_time(arrival_time);
				schedules.setDuration(duration);
				
				Flights flightS=flightService.findFlights(flight_id);
		
				schedules.setFlight(flightS);
		
				Schedule s=scheduleService.addSchedule(schedules);				
				ModelAndView model=null;
				if(s==null)
				{
					model = new ModelAndView("addFailed");
				}
				else
				{
					model= new ModelAndView("addSuccess");
					model.addObject("schedule",s);
				}
				
				return model;
			}
	@RequestMapping(value="/add5",method = RequestMethod.POST)
	public ModelAndView addair()
	
	{
				ModelAndView model=null;
			
				
		
					model = new ModelAndView("addSchedule");
				
				
				
				return model;
			}
	
}
