package com.lti.services;

import com.lti.model.AdminRegistration;

public interface AdminServices
{
	public AdminRegistration addAdmin(AdminRegistration ar);
	public AdminRegistration login(AdminRegistration ar);

}
