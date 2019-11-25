package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.AdminRegistration;
import com.lti.model.UserRegistration;
import com.lti.services.AdminServices;

@Controller
public class AdminController 
{
	
	@Autowired
	AdminServices adminService;
	
	@RequestMapping(value="/adminLogin",method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String admin_name, @RequestParam String admin_password)
	
	{
		AdminRegistration incomingAdmin= new AdminRegistration();
		System.out.println("in controller");
		incomingAdmin.setAdmin_name(admin_name);
		incomingAdmin.setAdmin_password(admin_password);
		AdminRegistration a = adminService.login(incomingAdmin);
				ModelAndView model=null;
				
				System.out.println(incomingAdmin);
				
				if(a==null)
				{
					model=new ModelAndView("addFailed");
				}else
				{
					model = new ModelAndView("loggedIn");
					model.addObject("adminregistration", a);
				}
				
				return model;
			}
			

}
