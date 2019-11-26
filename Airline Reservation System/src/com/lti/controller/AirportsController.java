package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Airports;
import com.lti.services.AirportServices;

@Controller
public class AirportsController 
{
	@Autowired
	AirportServices airportService;
	
	@RequestMapping(value="/addAirport",method=RequestMethod.POST)
	public ModelAndView addAirport(String airport_id, String airport_name,String city_name)
	{
		Airports addAirport1 = new Airports();
		addAirport1.setAirport_id(airport_id);
		addAirport1.setAirport_name(airport_name);
		addAirport1.setCity_name(city_name);
		
		Airports a=airportService.addAirport(addAirport1);
				
		ModelAndView model=null;
		if(a==null)
		{
			model = new ModelAndView("addFailed");
		}
		else
		{
			model= new ModelAndView("addSuccess");
			model.addObject("airports",a);
		}
		
		return model;
	}
	
	@RequestMapping(value="/add3",method = RequestMethod.POST)
	public ModelAndView addair()
	
	{
				ModelAndView model=null;
			
				
		
					model = new ModelAndView("addAirport");
				
				
				
				return model;
			}

	
	
}
