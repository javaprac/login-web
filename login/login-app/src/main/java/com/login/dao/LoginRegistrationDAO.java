package com.login.dao;

import com.login.entities.ServiceStatus;
import com.login.entities.UserDetails;
import com.login.entities.UserLoginInfo;
import com.login.exception.LoginRegistrationException;

public interface LoginRegistrationDAO {

	public ServiceStatus registerUser(UserDetails userDetails) throws LoginRegistrationException;
	public UserDetails authenticate(UserLoginInfo userLoginInfo) throws LoginRegistrationException;
}
