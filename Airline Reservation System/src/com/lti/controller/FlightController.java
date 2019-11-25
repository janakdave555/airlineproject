package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AircraftType;
import com.lti.model.Flights;
import com.lti.model.Sector;
import com.lti.services.AircraftTypeService;
import com.lti.services.FlightServices;
import com.lti.services.SectorServices;

@Controller
public class FlightController 
{

	@Autowired
	FlightServices flightService;
	
	@Autowired
	SectorServices sectorService;
	
	@Autowired
	AircraftTypeService aircraftTypeService;
	
	
	@RequestMapping(value="/addFlight",method=RequestMethod.POST)
	public ModelAndView addFlights(String flight_number,int sector_id,int aircraft_typeid,String status)
	{
		
		System.out.println("in controller");
		Flights incomingFlights = new Flights();
		
		incomingFlights.setFlight_number(flight_number);
		incomingFlights.setStatus(status);
		
		Sector sector=sectorService.findSector(sector_id);
	
		incomingFlights.setSector(sector);
		
		AircraftType aircraftType=aircraftTypeService.findAircraftType(aircraft_typeid);
		
		incomingFlights.setAircraftType(aircraftType);		
	
		Flights f=flightService.addFlights(incomingFlights);
		
		System.out.println(f);
		
		ModelAndView model=null;
		if(f==null)
		{
			model = new ModelAndView("addFailed");
		}
		else
		{
			model= new ModelAndView("addSuccess");
			model.addObject("flight",f);
		}
		
		return model;
	}
	
}
