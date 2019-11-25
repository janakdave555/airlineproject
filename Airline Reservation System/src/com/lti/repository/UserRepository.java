package com.lti.repository;

import com.lti.model.UserRegistration;

public interface UserRepository {

	public UserRegistration addUser(UserRegistration ur);
	public UserRegistration findUserByEmail(String email);

}