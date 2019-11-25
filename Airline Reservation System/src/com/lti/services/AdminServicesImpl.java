package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.AdminRegistration;
import com.lti.repository.AdminRepository;

@Service("adminService")
public class AdminServicesImpl implements AdminServices
{
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	@Transactional
	public AdminRegistration addAdmin(AdminRegistration ar)
	{

		return adminRepository.addAdmin(ar);
	}

	@Override
	@Transactional
	public AdminRegistration login(AdminRegistration ar)
	{
		
		
				AdminRegistration adminToBeReturned=null;
				AdminRegistration aDB=adminRepository.findAdminByAdminName(ar.getAdmin_name());
				
				if(aDB==null)
				{
					
				}
				else if(  (aDB.getAdmin_name().equals(ar.getAdmin_name()))  &&   (aDB.getAdmin_password().equals(ar.getAdmin_password()))    )
				{
					adminToBeReturned=aDB;
				}
				else
				{
					
				}
				return adminToBeReturned;
		
	}
	

}
