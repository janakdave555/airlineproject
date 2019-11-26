package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Aircraft;
import com.lti.model.AircraftType;
import com.lti.services.AircraftService;
import com.lti.services.AircraftTypeService;

@Controller
public class AircraftController {

	@Autowired
	AircraftService aircraftService;
	
	@Autowired
	AircraftTypeService aircraftTypeService;
	
	@RequestMapping(value="/addAircraft", method=RequestMethod.POST)
	public ModelAndView addAircraft(String aircraft_tailId,int aircraft_typeid)
	{	
		Aircraft air = new Aircraft();
	

	air.setAircraft_tailId(aircraft_tailId);
	
	AircraftType aircraftType=aircraftTypeService.findAircraftType(aircraft_typeid);

	air.setAircraftType(aircraftType);
	
	Aircraft aircraft=aircraftService.addAircraft(air);
	
	System.out.println("Aircraft: "+air);
	
	ModelAndView model=null;
	System.out.println(air);
	
	if(aircraft==null)
	{
		model=new ModelAndView("addFailed");
	}
	
	else
	
	{
		model = new ModelAndView("addSuccess");
		model.addObject("aircraft", aircraft);
	}
	
		
		return model;
	}

	@RequestMapping(value="/add1",method = RequestMethod.POST)
	public ModelAndView addair()
	
	{
				ModelAndView model=null;
			
				
		
					model = new ModelAndView("addAircraft");
				
				
				
				return model;
			}
}
