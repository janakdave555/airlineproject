package com.lti.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Airports;
import com.lti.model.Flights;
import com.lti.model.Schedule;
import com.lti.model.Sector;
import com.lti.services.AirportServices;
import com.lti.services.FlightServices;
import com.lti.services.ScheduleService;
import com.lti.services.SectorServices;

@Controller
public class SearchController 
{

	@Autowired
	AirportServices airportServices;
	
	@Autowired
	SectorServices sectorServices;
	
	@Autowired   
	FlightServices flightServices;
	
	
	@Autowired
	ScheduleService scheduleServices;

	List<Flights> flight;    
	List<Schedule>  schedule;
	@RequestMapping(value="/flightSearch",method=RequestMethod.POST)
	public ModelAndView flightSearch(@RequestParam String source,@RequestParam String destination,@RequestParam Date date)
	{
		Airports a=new Airports();
		//Airports a1=new Airports();
		Sector s =new Sector();
		System.out.println("in controller search");
		a.setAirport_name(source); 
		a.setAirport_name(destination);
		
		ModelAndView model=null;
		
		Airports as=airportServices.findAirportBySource(source);
		String sid=as.getAirport_id();
		System.out.println(sid);
		s.setSourceS(as);
		
		
		Airports ad=airportServices.findAirportByDestination(destination);
		String did=ad.getAirport_id();
		System.out.println(did);
		s.setDestinationD(ad);
		
		
		Sector sector=sectorServices.findSectorId( sid, did);
		System.out.println(sector);
		int sector_id=sector.getSector_id();
		System.out.println(sector_id);
		
		
	
     	System.out.println("Sector id se schedule");
		
		schedule=scheduleServices.findScheduleWithFlight(sector_id,date);
		
		System.out.println(schedule);
		
		
		for(Schedule sc:schedule)
		{
			
				System.out.println(schedule);
			
				  
				
			}
		if(schedule==null)
		{
			model=new ModelAndView("addfailed");
		}
		else
		{
			for(Schedule s1:schedule)
			{
				System.out.println(s1.getFlight());
			}
		
		
			model=new ModelAndView("scheduleShow");
			model.addObject("schedule", schedule);
		}
		
		return model;	
	}
}
