package com.lti.services;

import com.lti.model.UserRegistration;

public interface UserServices 
{
   public	UserRegistration addUser(UserRegistration ur);
	public UserRegistration login(UserRegistration ur);

}
