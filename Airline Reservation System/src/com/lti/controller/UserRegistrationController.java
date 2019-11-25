package com.lti.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.model.UserRegistration;
import com.lti.services.UserServices;
import com.lti.util.DateWorker;

@Controller
public class UserRegistrationController {

	@Autowired
	UserServices userService;

	@RequestMapping(value="/userLogin",method = RequestMethod.POST)
	public ModelAndView login(@RequestParam String email, @RequestParam String password)
	
	{
UserRegistration incomingUser = new UserRegistration();
System.out.println("in controller");
		incomingUser.setEmail(email);
		incomingUser.setPassword(password);
		UserRegistration u = userService.login(incomingUser);
		ModelAndView model=null;
		System.out.println(incomingUser);
		if(u==null)
		{
			model=new ModelAndView("addFailed");
		}else
		{
			model = new ModelAndView("loggedIn");
			model.addObject("userregistration", u);
		}
		
		return model;
	}
	

@RequestMapping(value="/addUserRegister", method=RequestMethod.POST)
public ModelAndView addUser(@RequestParam String email, @RequestParam String password,@RequestParam String first_name,@RequestParam String last_name,@RequestParam String gender,@RequestParam String phone_number,@RequestParam String status,@RequestParam String title,String date_of_birth)
{
	System.out.println("in controller");
	
	UserRegistration incomingUser = new UserRegistration();
	incomingUser.setEmail(email);
	incomingUser.setPassword(password);
	incomingUser.setFirst_name(first_name);
	incomingUser.setLast_name(last_name);
	incomingUser.setGender(gender);
	incomingUser.setTitle(title);

	incomingUser.setDate_of_birth(DateWorker.formatDate(date_of_birth));
	incomingUser.setPhone_number(phone_number);
	incomingUser.setStatus(status);
	
	System.out.println(incomingUser);   
	
	UserRegistration user=userService.addUser(incomingUser);
	
	ModelAndView model=null;
	System.out.println(incomingUser);
	if(user==null)
	{
		model=new ModelAndView("addFailed");
	}else
	{
		model = new ModelAndView("addSuccess");
		model.addObject("userregistration", user);
	}
	
		
		return model;
	
}

}
	

