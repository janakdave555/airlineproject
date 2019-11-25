package com.lti.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.UserRegistration;
import com.lti.repository.UserRepository;

@Service("userService")
public class UserServicesImpl implements UserServices
{
	
	@Autowired
	UserRepository userRepository;

	
	

	@Override
	public UserRegistration addUser(UserRegistration ur)
	{
		
		return userRepository.addUser(ur);

	}

	
	
	
	
	
	@Override
	public UserRegistration login(UserRegistration ur) {
			UserRegistration userToBeReturned=null;
			UserRegistration uDB=userRepository.findUserByEmail(ur.getEmail());
			
			if(uDB==null)
			{
				
			}
			else if(  (uDB.getEmail().equals(ur.getEmail()))  &&   (uDB.getPassword().equals(ur.getPassword()))    )
			{
				userToBeReturned=uDB;
			}
			else
			{
				
			}
			return userToBeReturned;
		}

	}
	

