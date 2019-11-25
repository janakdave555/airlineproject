package com.lti.repository;

import com.lti.model.AdminRegistration;

public interface AdminRepository
{

	public AdminRegistration addAdmin(AdminRegistration ar);
	public AdminRegistration findAdminByAdminName(String admin_name);
	
}
