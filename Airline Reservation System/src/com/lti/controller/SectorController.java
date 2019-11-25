package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.Airports;
import com.lti.model.Sector;
import com.lti.services.AirportServices;
import com.lti.services.SectorServices;

@Controller
public class SectorController 

{
  
	@Autowired
	SectorServices sectorServices;
	
	@Autowired
	AirportServices airportService;
	@RequestMapping(value="/addSector",method=RequestMethod.POST)
	public ModelAndView addSector(String source, String destination)
	
	{
		
		Sector sector = new Sector();
		
		Airports sourceAirport=airportService.findAirport(source);
		System.out.println(sourceAirport);
		
		Airports destinationAirport=airportService.findAirport(destination);
		
		System.out.println(destinationAirport);
		
		sector.setSourceS(sourceAirport);
		sector.setDestinationD(destinationAirport);
		System.out.println(sector);
		Sector s=sectorServices.addSector(sector);
		System.out.println(s);
		ModelAndView model=null;
		if(s==null)
		{
			model = new ModelAndView("addFailed");
		}
		else
		{
			model= new ModelAndView("addSuccess");
			model.addObject("sector",s);
		}
		
		return model;
	}
	
	
	@RequestMapping(value="/showSector",method=RequestMethod.GET)
	public ModelAndView getSector(@RequestParam int sector_id)
	{
		Sector s= sectorServices.findSector(sector_id);
		ModelAndView model=new ModelAndView("sector");
		model.addObject("sector",s);
		return model;
				
	}
}
