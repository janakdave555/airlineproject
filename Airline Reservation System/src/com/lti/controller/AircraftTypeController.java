package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AircraftType;
import com.lti.services.AircraftTypeService;

@Controller
public class AircraftTypeController {

	@Autowired
AircraftTypeService aircraftTypeService;
	
	@RequestMapping(value="/addAircraftType",method=RequestMethod.POST)
	public ModelAndView addAircraftType(String aircraft_name,
	String aircraft_company,
	int aircraft_capacity,
	int aircraft_economy_seats,
	int aircraft_business_seats) {
		
		AircraftType aircrafttype1=new AircraftType();
		
		aircrafttype1.setAircraft_name(aircraft_name);
		aircrafttype1.setAircraft_company(aircraft_company);
		aircrafttype1.setAircraft_capacity(aircraft_capacity);
		aircrafttype1.setAircraft_economy_seats(aircraft_economy_seats);
		aircrafttype1.setAircraft_business_seats(aircraft_business_seats);
		
		AircraftType airt=aircraftTypeService.addAircraftType(aircrafttype1);
		
		ModelAndView model=null;
		if(airt==null)
		{
			model = new ModelAndView("addFailed");
		}
		else
		{
			model= new ModelAndView("addSuccess");
			model.addObject("aircrafttype",airt);
		}
		
		return model;
	}
	

	
	@RequestMapping(path = "/findAircraftType")
	public ModelAndView fetchAll() {
		
		List<AircraftTypeService> list = aircraftTypeService.findAll();
		ModelAndView model=null;
		
		System.out.println(list);
		
		if(list==null)
		{
			model=new ModelAndView("addfailed");
		}
		else
		{
			model=new ModelAndView("findAircraftType");
			model.addObject("aircraftType", list);
		}
		
		System.out.println(list);
		
		return model;
		
		
	}
	@RequestMapping(value="/add2",method = RequestMethod.POST)
	public ModelAndView addair()
	
	{
				ModelAndView model=null;
			
				
		
					model = new ModelAndView("addAircraftType");
				
				
				
				return model;
			}

}

